

import ModelLoginAPI  from  './ModelLoginAPI'
import Constantes  from  './Constantes.json'

const login = new ModelLoginAPI();

context("Test Suite",()=>{

    before(()=>{
       cy.log("Ejecutando precondiciones de pruebas");
    })
    after(()=>{
       cy.log("Suite de pruebas Ejecutada")
    })
    beforeEach(()=>{
       cy.log("Ejecutando Request:");
    })
    it("Caso de prueba 1",function(){
      login.POSTLogin;  
   })
    it("Caso de prueba 2",function(){
      //login.GETCodigoPostal();
        
    })
})