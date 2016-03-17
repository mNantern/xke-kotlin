package fr.xebia.xke

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule

@SpringBootApplication
open class Application {

    @Bean
    open fun objectMapperBuilder(): Jackson2ObjectMapperBuilder
            = Jackson2ObjectMapperBuilder().modulesToInstall(KotlinModule(), JavaTimeModule())

    companion object {
        @JvmStatic public fun main(args: Array<String>) {
            SpringApplication.run(Application::class.java, *args)
        }
    }
}