package com.hamma;

import com.hamma.dto.PointOld;
import com.hamma.dto.PointRecord;

public class Application {
	public static void main(String[] args) {
		PointOld pos = new PointOld(10, 10);
		System.out.println("----->"+pos.getX());
		PointRecord p=new PointRecord(110, 110);
		System.out.println("----->"+pos.toString());
		System.out.println("----->"+p.toString());
		System.out.println("----->"+p.y());
	}
}
