module JaxRsModule {
	//requires static lombok;
	exports com.hamma.model.entity;
	requires java.desktop;
	requires java.xml;
	requires jdk.compiler;
	requires jdk.javadoc;
	requires lombok;
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
	requires jersey.server;
	requires jakarta.validation;
	requires jakarta.ws.rs;
	requires jakarta.inject;
	requires jakarta.servlet;
	requires org.glassfish.hk2.api;
	//requires jakarta.pers;
}