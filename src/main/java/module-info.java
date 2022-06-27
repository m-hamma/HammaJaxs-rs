module JaxRsModule {
	//requires static lombok;
	exports com.hamma.entity;
	requires java.desktop;
	requires java.xml;
	requires jdk.compiler;
	requires jdk.javadoc;
	requires lombok;
	requires org.aspectj.weaver;
	requires com.h2database;
	requires java.persistence;
	requires jersey.common;
	requires org.hibernate.orm.core;
	requires com.fasterxml.jackson.annotation;
	requires jdk.jpackage;
	requires spring.data.commons;
	requires java.base;
	requires static org.mapstruct;
	requires org.mapstruct.processor;
	//requires jakarta.pers;
}