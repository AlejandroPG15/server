package com.example.server

import org.springframework.web.bind.annotation.*

@RestController
class GatetesController(private val gatetesRepository : GatetesRepository) {

    @GetMapping("/students")
    fun getAllGatetes() : List<Gatetes> {
        return gatetesRepository.findAll()
    }

    @PostMapping("/students")
    fun insertGatetes(@RequestBody student : Gatetes){
        gatetesRepository.save(student)
    }

    @GetMapping("/student/{id}")
    fun getGatetes(@PathVariable id : Long) : Gatetes {
        return gatetesRepository.findById(id).get()
    }

    @DeleteMapping("/student/{id}")
    fun deleteGatetes(@PathVariable id : Long){
        gatetesRepository.deleteById(id)
    }

}