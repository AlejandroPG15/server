package com.example.server

import org.springframework.data.jpa.repository.JpaRepository

interface GatetesRepository : JpaRepository<Gatetes, Long> {
}