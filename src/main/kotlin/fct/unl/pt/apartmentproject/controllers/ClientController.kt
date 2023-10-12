package fct.unl.pt.apartmentproject.controllers

import fct.unl.pt.apartmentproject.domain.Client
import fct.unl.pt.apartmentproject.domain.ClientRepository
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/clients")
class ClientController(val clientRepository: ClientRepository) {

    @GetMapping("")
    fun getAllClients(): Iterable<Client> = clientRepository.findAll()

    @PostMapping("")
    fun addClient(@RequestParam client: Client) { clientRepository.save(client) }

    @DeleteMapping("")
    fun removeClient(@RequestParam id: Long) { clientRepository.deleteById(id) }

}