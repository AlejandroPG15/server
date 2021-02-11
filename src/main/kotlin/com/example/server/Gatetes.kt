package com.example.server

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Gatetes (var numero : Int, var fact : String) {
    @Id
    @GeneratedValue
    private val id: Long? = null

    override fun equals(other: Any?): Boolean {
        if (other is Gatetes){
            return other.id == id && id != null
        } else {
            return false
        }
    }

    override fun hashCode(): Int {
        return Objects.hash(id, numero, fact)
    }

    override fun toString(): String {
        return "$id curiosidad $numero : $fact"
    }
}