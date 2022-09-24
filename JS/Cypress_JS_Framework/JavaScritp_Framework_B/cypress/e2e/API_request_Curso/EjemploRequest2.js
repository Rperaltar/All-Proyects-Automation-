describe('Suite Request API Test',function(){


it('Test Method "GET Request"',function(){

        cy.request('GET','http://httpbin.org/get')
            .then((response) => {
             expect(response.body).to.have.property('url','http://httpbin.org/get');
   });
});

it('Test Method "POSTRequest"',function(){

        cy.request(
        {
            method : 'POST',
            url : 'http://httpbin.org/post',
            headers : {
                'Content-Type' : 'application/json'
        },
            body: 
            {
                'name' : 'Test3',
                'age'  : 33
            }

    }).then((response)=>{
            expect(response.body).to.have.property('json');
            expect(response.body.json).to.deep.equal(
        { 
            "name" : "Test3",
            "age"  : 33 
        });
            expect(response.status).to.equal(200);
            expect(response.duration).to.not.be.greaterThan(90); 
    });
});
          
it('Test Method "PUT Request"',function(){

        cy.request('PUT','http://httpbin.org/put',
        { 
            "name":"TestPUT",
            "age" : 33 
        })
            .then((response) => {
            expect(response.body).to.have.property('json');
            expect(response.body.json).to.deep.equal(
        { 
            "name":"TestPUT",
            "age" : 33 
        });
            expect(response.status).to.equal(200);
            expect(response.duration).to.not.be.greaterThan(90);  
    });
});

it('Test Method "PATCH Request"',function(){

        cy.request('PATCH','http://httpbin.org/patch',{ "name" : "TestPATCH" })
            .then((response) => {
            expect(response.body).to.have.property('json');
            expect(response.body.json).to.deep.equal({ "name":"TestPATCH" })
            expect(response.status).to.equal(200);
            expect(response.duration).to.not.be.greaterThan(120); 
    
            });
           
        });

it('Test Method "DELETE  Request"',function(){
        cy.request('DELETE','http://httpbin.org/delete',{ "age" : 33 })
            .then((response) => {
            expect(response.body).to.have.property('json');
            expect(response.body.json).to.deep.equal({ "age" : 33 }) 
            expect(response.status).to.equal(200);
            expect(response.duration).to.not.be.greaterThan(150); 
        });     
    });
});
