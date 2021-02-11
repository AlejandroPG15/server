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
    fun initDatabase(gatetesRepository : GatetesRepository) : CommandLineRunner {
        return CommandLineRunner { args: Array<String?>? ->
            logger.info("Preloading " + gatetesRepository.save(Gatetes(1, "Cats make about 100 different sounds. Dogs make only about 10.")))
            logger.info("Preloading " + gatetesRepository.save(Gatetes(2, "Domestic cats spend about 70 percent of the day sleeping and 15 percent of the day grooming.")))
            logger.info("Preloading " + gatetesRepository.save(Gatetes(3, "I don't know anything about cats.")))
            logger.info("Preloading " + gatetesRepository.save(Gatetes(4, "The technical term for a cat’s hairball is a bezoar.")))
            logger.info("Preloading " + gatetesRepository.save(Gatetes(5, "Cats are the most popular pet in the United States: There are 88 million pet cats and 74 million dogs.")))
        }

    }
}