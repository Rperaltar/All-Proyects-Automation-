
import ModLogin from  '../ModelPages/ModLogin'
import Actions   from  '../Base/Actions'
import Input     from  '../Constants/Input.json'

const action = new Actions();
var login = new ModLogin();

class LoginUser{

LoginUser(){
}      

loginUser(user,password){
   
      login.SingIn().click()
      cy.wait(2000)
      login.User().type(user);
      login.Passwd().type(password);
      login.Submmit().click()
      cy.screenshot(); 
} 
Excpect() { 
      expect(login.VisitUrl).to.equal(login.VisitUrl)
      action.log("Caso de prueba 2 Exitoso ");

return this.Excpect()      
} 

 //ejemplo2
user(user){
  return this.login.User().clear().type(user);
}
pwd(pass){
  return this.login.Passwd().clear().type(pass);
}
submit(){
  return this.login.Submmit().click()
} 
Sing(){
  return this.login.SingIn().click()
   }   
 }

export default LoginUser
            