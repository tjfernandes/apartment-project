package fct.unl.pt.apartmentproject.controllers

import fct.unl.pt.apartmentproject.domain.Client
import fct.unl.pt.apartmentproject.domain.Owner
import fct.unl.pt.apartmentproject.domain.OwnerRepository
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/owners")
class OwnerController(val ownerRepository: OwnerRepository) {

    @GetMapping("")
    fun getAllOwners(): Iterable<Owner> = ownerRepository.findAll()

    @PostMapping("")
    fun addOwner(@RequestParam owner: Owner) { ownerRepository.save(owner) }

    @DeleteMapping("")
    fun removeOwner(@RequestParam id: Long) { ownerRepository.deleteById(id) }
}