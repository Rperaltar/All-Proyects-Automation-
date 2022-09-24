const { before, after, beforeEach, afterEach } = require("mocha");

import ModLogin from  '../ModelPages/ModLogin'
import Actions   from  '../Base/Actions'
import Input     from  '../Constants/Input.json'
import ModelLoginMethds from  '../ModelMethods/ModelLoginMethds'


const action = new Actions();
var login = new ModLogin();

context("Test Suite",()=>{

    before(()=>{
       action.log("Ejecutando precondiciones de pruebas");
    })
    after(()=>{
       action.log("Suite de pruebas Ejecutada")
    })
      beforeEach(()=>{
         login.VisitUrl();
         action.log("Visitando Pagina:");
      })
   
         it("Caso de prueba 1",function(){

            login.LoginUser(Input.login.EMAIL,Input.login.PASSWD);

         })

            it("Caso de prueba 2",function(){

               login.SingIn().click()
               cy.wait(2000)
               login.User().type(Input.login.EMAIL);
               login.Passwd().type(Input.login.PASSWD);
               login.Submmit().click()
               cy.screenshot();

               expect(login.VisitUrl).to.equal(login.VisitUrl)
               action.log("Caso de prueba 2 Exitoso ");

            })
            it("Caso de prueba 3",function(){

               login.Sing()
               action.TimeWait(2000)
               login.user(Input.login.EMAIL)
               login.pwd(Input.login.PASSWD)
               login.submit()
               cy.screenshot()

               expect(login.VisitUrl).to.equal(login.VisitUrl)
               action.log("test actions")

            })
            it("Caso de prueba 4",function(){

               loggiUser = new ModelLoginMethds()

               loggiUser.loginUser(Input.login.EMAIL,Input.login.PASSWD)
               loggiUser.Excpect()
            })
            it("Caso de prueba 5",function(){


               
               loggiUser.Sing()
               loggiUser.user(Input.login.EMAIL)
               loggiUser.pwd(Input.login.PASSWD)
               loggiUser.submit()
               cy.screenshot()
               loggiUser.Excpect()

            })
            
            //failed
            it("Caso de prueba 6",function(){

               login.SingInLogin()
               login.Email(Input.login.EMAIL)
               login.Password(Input.login.PASSWD)
               login.Submited()
               cy.screenshot(Input.url.PATH_ASHOT)

               expect(login.VisitUrl).to.equal(login.VisitUrl)
               action.log("test actions")

            }) // failed esto si funciona en java              
            it("Caso de prueba 7",function(){

               action.Click(login.SingIn())
               action.TimeWait(2000)
               action.Type(login.User(Input.login.EMAIL))
               action.Type(login.Passwd(Input.login.PASSWD))
               action.Click(login.Submmit)
               cy.screenshot(Input.url.PATH_ASHOT)

               expect(login.VisitUrl).to.equal(login.VisitUrl)
               action.log("test actions")

   })           
})