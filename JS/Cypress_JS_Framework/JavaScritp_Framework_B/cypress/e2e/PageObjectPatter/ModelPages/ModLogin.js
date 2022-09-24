
import Input     from  '../Constants/Input.json'
import Actions   from  '../Base/Actions'

const action = new Actions();

class ModLogin {

//Ejemplo 1
VisitUrl(){

    cy.visit('https://www.demoblaze.com', {
  timeout: 50000, // increase total time for the visit to resolve
 })
}

User(){

    return cy.get('#sign-username')   
}

Passwd(){
   
    return cy.get('#sign-password')
    
}

Submmit(){

    return cy.get('#signInModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)')
    
 } 

SingIn(){

    return cy.get('#signin2')
    
   }

// Ejemplo2
LoginUser(user, passwd){

      this.SingIn().click()
      this.User().type(user);
      this.Passwd().type(passwd);
      this.Submmit().click()

      action.log("Caso de prueba 1 Exitoso ");
    
      return this.LoginUser
   }

//ejemplo3
user(user){
    this.User().clear().type(user);
}
pwd(pass){
    this.Passwd().clear().type(pass);
}
submit(){
    this.Submmit().click()
} 
Sing(){
    this.SingIn().click()
  }

//Ejemplo4
    get addEmail() { 
        return cy.get('#sign-username');}
    get addPassword() { 
        return cy.get('#sign-password');}
    get clickSubmmit() { 
        return cy.get('#signInModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)'); }
    get clickSingIn() { 
        return cy.get('#signin2');}
Email(user){
     this.addEmail().clear().type(user);
}
Password(passwd){
     this.addPasswd().clear().type(passwd);
}
Submited(){
     this.clickSubmmit().click();
 } 
SingInLogin(){
     this.clickSingIn().click();
   }
}
  export default ModLogin

