
import Constantes  from  '../PrimeTime/Constantes.json'

class ModelLoginAPI{


POSTLogin(){

        cy.request({
            method : 'POST',
            url : Constantes.SEND.API_INICIAR_SESION,
            body: 
            {
                "email":"noeisaipc2@live.com.mx",
                "password":"$argon2id$v=19$m=16,t=2,p=1$Z0o2bGhHMDVkbFBJb3BBeQ$R4FosPT9jkX8QfvI9VNg8Q"
            },
            headers : {
                'Content-Type' : 'application/json'
            }

        }).then(function(response){

            expect(response.status).to.equal(200);
            expect(response.duration).to.not.be.greaterThan(500);
            cy.log(response.body)
    })
  }

  GETCodigoPostal(){


    cy.request({
        method : 'GET',
        url : Constantes.SEND.API_CODIGO_POSTAL,
        body: 
        {
            "zipcode": 54743,
        },
        headers : {
            'Content-Type' : 'application/json'
        }

    }).then(function(response){

        expect(response.status).to.equal(200);
        expect(response.duration).to.not.be.greaterThan(500);
    })
  }
}
export default ModelLoginAPI  
   