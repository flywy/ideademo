package com.flying;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {

    public static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(1, 10, Transaction.Type.GEOCERY));
        transactions.add(new Transaction(3, 30, Transaction.Type.GEOCERY));
        transactions.add(new Transaction(6, 60, Transaction.Type.GEOCERY));
        transactions.add(new Transaction(5, 50, Transaction.Type.GEOCERY));
        transactions.add(new Transaction(2, 20, Transaction.Type.A));
        transactions.add(new Transaction(4, 40, Transaction.Type.C));

        // JDK 8 如果发现type为grocery的所有交易, 然后返回以交易值降序排序的交易ID集合
        List<Integer> transactionsIds =
                transactions.parallelStream().filter(t -> t.getType() == Transaction.Type.GEOCERY)
                        .sorted(Comparator.comparing( Transaction::getValue).reversed())
                        .map(Transaction::getId)
                        .collect(Collectors.toList());

        List<Integer> transactionsIds1 =
                transactions.parallelStream().filter(t -> t.getType() == Transaction.Type.GEOCERY)
                        .sorted(Comparator.comparing( Transaction::getValue).reversed())
                        .map(Transaction::getId)
                        .collect(Collectors.toList());

        List<Integer> transactionsIds2 =
                transactions.parallelStream().filter(t -> t.getType() == Transaction.Type.GEOCERY)
                        .sorted(Comparator.comparing( Transaction::getValue).reversed())
                        .map(Transaction::getId)
                        .collect(Collectors.toList());



        System.out.println(transactionsIds);//[6, 5, 3, 1]


        System.out.println(transactionsIds);//[6, 5, 3, 1]


    }

}
