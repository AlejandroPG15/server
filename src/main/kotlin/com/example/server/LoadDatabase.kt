package com.example.server

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class LoadDatabase {
    companion object {
        val logger = LoggerFactory.getLogger(LoadDatabase.javaClass)
    }

    @Bean
    fun initDatabase(studentRepository : GatetesRepository) : CommandLineRunner {
        return CommandLineRunner { args: Array<String?>? ->
            logger.info("Preloading " + studentRepository.save(Gatetes(1, "Cats make about 100 different sounds. Dogs make only about 10.")))
            logger.info("Preloading " + studentRepository.save(Gatetes(2, "Domestic cats spend about 70 percent of the day sleeping and 15 percent of the day grooming.")))
        }

    }
}