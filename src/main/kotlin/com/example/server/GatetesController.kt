package com.example.server

import org.springframework.web.bind.annotation.*

@RestController
class GatetesController(private val gatetesRepository : GatetesRepository) {

    @GetMapping("/gatos")
    fun getAllGatetes() : List<Gatetes> {
        return gatetesRepository.findAll()
    }

    @PostMapping("/gatos")
    fun insertGatetes(@RequestBody student : Gatetes){
        gatetesRepository.save(student)
    }

    @GetMapping("/gatos/{id}")
    fun getGatetes(@PathVariable id : Long) : Gatetes {
        return gatetesRepository.findById(id).get()
    }

    @DeleteMapping("/gatos/{id}")
    fun deleteGatetes(@PathVariable id : Long){
        gatetesRepository.deleteById(id)
    }

}