context('Ejemplo Suite Request', ()=> {

    it('Test Method "GET Request"',()=>{
        cy.request('GET','http://httpbin.org/get')
        .then((response) => {
            expect(response.body).to.have.property('url','http://httpbin.org/get');
            expect(response.status).to.equal(200);
            expect(response.duration).to.not.be.greaterThan(90); 

       });
    });

    it('Test Method "GET"',()=>{

        cy.request({
            method : 'GET',
            url : 'http://httpbin.org/get',

        }).then(function(response){

            expect(response.body).have.property('url');
            expect(response.status).to.equal(200);
            expect(response.duration).to.not.be.greaterThan(90); 
            // this assertion expects response time to be less than 2 kB i.e 2048 bytes
            //expect(parseInt(response.headers[`content-length`])).to.be.lessThan(2048) 
        });
    });

    it('Test Method "POST"',()=>{

        cy.request({
            method : 'POST',
            url : 'http://httpbin.org/post',
            body: 
            {
                'Id'   : 1,
                'name' : 'Test',
                'age'  : 27
            },
            headers : {
                'Content-Type' : 'application/json'
            }

        }).then(function(response){

            expect(response.status).to.equal(200);
            expect(response.body).have.property('json');
            expect(response.body.json).to.deep.equal(
                {   
                    "Id"  : 1,
                    "name": "Test",
                    "age" : 27
                });
            expect(response.duration).to.not.be.greaterThan(100); 
    });

    it('Test Method "PUT"',()=>{

        cy.request({
            method : 'PUT',
            url : 'http://httpbin.org/put',
            body: 
            {
            'ID'   : 2,
            'name' : 'TestUpdate',
            'age'  : 28
            },
            headers : {
                    'Content-Type' : 'application/json'
            }
        
        }).then(function(response){
        
            expect(response.body).have.property('json');
            expect(response.body.json).to.deep.equal(
                {
                    "ID" : 2,
                    "name" : "TestUpdate",
                    "age"  : 28 
                });
    });

    it('Test Method "PATCH"',()=>{

        cy.request({
            method : 'PATCH',
            url : 'http://httpbin.org/patch',
            body: 
            {
            'ID'   : 2,
            'name' : 'TestUpdate',
            'age'  : 29
            },
            headers : {
                    'Content-Type' : 'application/json'
            }
                
        }).then(function(response){
                
            expect(response.body).have.property('json');
            expect(response.body.json).to.deep.equal(
                {
                    "ID" : 2,
                    "name" : "TestUpdate",
                    "age"  : 29 
                });
    });

    it('Test Method "Delete"',()=>{

        cy.request({
            method : 'Delete',
            url : 'http://httpbin.org/delete',
            body: 
            {
            'ID'   : 2
            },
            headers : {
                'Content-Type' : 'application/json'
            }
                
        }).then(function(response){
                
            expect(response.status).to.equal(200);
            expect(response.duration).to.not.be.greaterThan(1000); 

                });
             });    
          });
       });
    });
 });
