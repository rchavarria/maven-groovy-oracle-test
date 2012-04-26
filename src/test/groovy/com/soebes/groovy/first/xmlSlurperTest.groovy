package com.soebes.groovy.first

import groovy.util.GroovyTestCase
import groovy.util.XmlSlurper
import groovy.sql.Sql

class xmlSlurperTest extends GroovyTestCase {

    void testFirst() {
    	def pom = new XmlSlurper().parse(new File('pom.xml'))
    		
    	println pom.size()
    	pom.childNodes().each {
    	    item -> println "Item:" +item.name()
    	}
    	
    	def version = pom.childNodes().find {
    	    item -> item.name().equals("version")
    	}
    	println pom.@project.size()
    	
    	println "Node: Version:" + version.text()
    }
}
