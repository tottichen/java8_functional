package me.totti.example.functional.stream;

import java.util.stream.Stream;

import me.totti.example.functional.supplier.PiSupplier;

/**
 * Title: PiStream.class<br>
 * Description: <br>
 * Copyright (c) TottiChen 2016    <br>
 * Create DateTime: 2016年07月13日 13:38 <br>
 *
 * @author TottiChen
 */
public class PiStream {

	public static void main(String[] args) {
		Stream<Double> piStream = Stream.generate(new PiSupplier());
		piStream.skip(100).limit(10).forEach(System.out::println);
	}
}
