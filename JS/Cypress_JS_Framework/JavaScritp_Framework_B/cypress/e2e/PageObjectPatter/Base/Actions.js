import dateFormat from "dateformat"


class Actions{
  
Check(element){
    return cy.get(element).check()
}
Click(element){
    return cy.get(element).click()
}
Clear(element){
    return cy.get(element).clear()
}
ClearCookie(element){
    return cy.clearCookie(element)
}
ClearCookies(element){
    return cy.clearCookies(element)
}
Dbclick(element){
    return cy.get(element).dblclick() 
}
Exec(element){
    return cy.exec(element)
}
Readfile(filePath){
    return cy.readFile(filePath)
}
Reload(){
    return cy.reload()
}
Request(httpRequest){
    return cy.request(httpRequest)
}
ClearCookies(element){
    return cy.get(element).rightclick() 
}
screenshot(pathAshot){
    return cy.screenshot(pathAshot)
}
isNotNull(){
    return cy.log('No es Nulo')
} 
Scrolldown(){
  return cy.scrollTo(0, 500) // Scroll the window 500px down
} 
Select(selectElement,element){
  return cy.get(element).select(selectElement) 
} 
Submmit(element){
  return cy.get(element).submit()
} 
Type(element,typeElement){
  return cy.get(element).type(typeElement)
} 
Uncheck(element){
  return cy.get(element).uncheck()
} 
VisitUrl(url){
  return cy.visit(url)
} 
TimeWait(time){
  return cy.wait(time)
} 
WriteFile(filePath, contents){
  return cy.writeFile(filePath, contents)
} 
Expect(exxpect, eequal){
  expect(exxpect).to.equal(eequal)
} 
log(equal){
  return cy.log(equal)
 }
 timeStamp(){
   
  now = new Date();
  // Basic usage
  dateFormat(now, 'dddd, mmmm dS, yyyy, h:MM:ss ');

 }


}

    export default Actions
  