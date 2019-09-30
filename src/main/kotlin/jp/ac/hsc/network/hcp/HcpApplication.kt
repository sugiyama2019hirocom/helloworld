package jp.ac.hsc.network.hcp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HcpApplication

fun main(args: Array<String>) {
	runApplication<HcpApplication>(*args)
}
