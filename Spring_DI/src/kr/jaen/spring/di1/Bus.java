package kr.jaen.spring.di1;

public class Bus implements Car {

	public void start() {
		System.out.println("버스가 출발합니다.");
	}

	public void stop() {
		System.out.println("버스가 멈춥니다.");
	}
}
