module b4j {
requires java.base;
requires java.desktop;
requires java.instrument;
requires java.logging;
requires java.management;
requires java.management.rmi;
requires java.naming;
requires java.rmi;
requires java.security.jgss;
requires java.security.sasl;
requires java.sql;
requires java.transaction.xa;
requires java.xml;
requires javafx.base;
requires javafx.controls;
requires javafx.fxml;
requires javafx.graphics;
requires javafx.media;
requires javafx.swing;
requires java.scripting;
requires jdk.unsupported;
requires java.datatransfer;
requires jdk.unsupported.desktop;
requires jdk.jsobject;
requires jdk.xml.dom;
exports b4j.example;
uses java.sql.Driver;
uses javax.servlet.ServletContainerInitializer;
uses javax.websocket.ContainerProvider;
uses org.eclipse.jetty.http.HttpFieldPreEncoder;
uses org.eclipse.jetty.websocket.api.extensions.Extension;
}