package com.rchavarria.groovy.oracle

import groovy.util.GroovyTestCase
import groovy.sql.Sql

class ReadSignalsDataTest extends GroovyTestCase {

    void testSignalData() {
        Sql sql = Sql.newInstance("jdbc:oracle:thin:@oractc:1521:ctc20",
                                  "usrtrctctoplit", 
                                  "usrtrctctoplit", 
                                  "oracle.jdbc.OracleDriver")
        
        def row = sql.firstRow("SELECT DESCRIPTION FROM TOPO_SN_D_SIGNALTYPE")
        println "First description: ${row.DESCRIPTION}"
    }
}
