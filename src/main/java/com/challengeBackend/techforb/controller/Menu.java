/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.challengeBackend.techforb.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menu")
@CrossOrigin(origins = "https://challenge-front-git-main-salazar-mario.vercel.app")
public class Menu {

  @Autowired
  private MenuService menuService; // Inyecta un servicio de menú en lugar de sí mismo

  @GetMapping
  public ResponseEntity<List<MenuOption>> getMenu() {
    List<MenuOption> menu = menuService.getMenuOptions(); // Implementa la lógica para obtener el menú desde el servicio
    return ResponseEntity.ok(menu);
  }
}
