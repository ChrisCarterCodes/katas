package katas;

import static org.junit.Assert.*;

import org.junit.Before;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class FoorBarQixTest {
	FooBarQix fooie = new FooBarQix();
	
	@Before
	public void setUp() {
		fooie = new FooBarQix();
	}
	

	@Test
	public void compute_whenOneIsPassed_ReturnOne() {
		assertThat(fooie.compute("1")).isEqualTo("1");
	}
	
	@Test
	public void compute_whenTwoIsPassed_ReturnTwo() {
		assertThat(fooie.compute("2")).isEqualTo("2");
	}
	
	@Test
	public void compute_whenThreeIsPassed_ReturnFooFoo() {
		assertThat(fooie.compute("3")).isEqualTo("FooFoo");
	}
	
	@Test
	public void compute_whenFourIsPassed_ReturnFour() {
		assertThat(fooie.compute("4")).isEqualTo("4");
	}
	
	@Test
	public void compute_whenFiveIsPassed_ReturnBarBar() {
		assertThat(fooie.compute("5")).isEqualTo("BarBar");
	}
	
	@Test
	public void compute_whenSixIsPassed_ReturnFoo() {
		assertThat(fooie.compute("6")).isEqualTo("Foo");
	}
	
	@Test
	public void compute_whenSevenIsPassed_ReturnQixQix() {
		assertThat(fooie.compute("7")).isEqualTo("QixQix");
	}
	
	@Test
	public void compute_whenEightIsPassed_ReturnEight() {
		assertThat(fooie.compute("8")).isEqualTo("8");
	}
	
	@Test
	public void compute_whenNineIsPassed_ReturnFoo() {
		assertThat(fooie.compute("9")).isEqualTo("Foo");
	}
	
	@Test
	public void compute_whenTenIsPassed_ReturnBar() {
		assertThat(fooie.compute("10")).isEqualTo("Bar");
	}
	
	public void compute_when13IsPassed_ReturnFoo() {
		assertThat(fooie.compute("13")).isEqualTo("Foo");
	}
	
	public void compute_when15IsPassed_ReturnFooBarBar() {
		assertThat(fooie.compute("15")).isEqualTo("FooBarBar");
	}
	
	public void compute_when21IsPassed_ReturnFooQix() {
		assertThat(fooie.compute("21")).isEqualTo("FooQix");
	}
	
	public void compute_when33IsPassed_ReturnFooFooFoo() {
		assertThat(fooie.compute("33")).isEqualTo("FooFooFoo");
	}
	
	public void compute_when51IsPassed_ReturnFooBar() {
		assertThat(fooie.compute("51")).isEqualTo("FooBar");
	}
	
	public void compute_when53IsPassed_ReturnBarFoo() {
		assertThat(fooie.compute("53")).isEqualTo("BarFoo");
	}

}
