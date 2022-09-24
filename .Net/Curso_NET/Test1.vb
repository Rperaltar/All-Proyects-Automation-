Imports NUnit.Framework

Namespace Curso_NET

    Public Class Tests


        <SetUp>
        Public Sub Setup()
        End Sub

        <Test>
        Public Sub TestObject()

            Dim prop As New Propiedades()

            For i = 0 To 10 Step 10

                prop.metodo_Name()
                prop.metodo_Test("Test2")
                prop.metodo_Estudios()
                prop.metodo_Escuela("Mexican University")
                prop.Nombre = "Test Getter / Setter"
                prop.Nombre.Equals("")
                prop.Nombre.Contains("")
                prop.EDAD = 35
                prop.SEXO = "H"
                prop.ESTATURA = 1.8
                prop.TRABAJO = True
                prop.TEST = 2022
                prop.EJEMPLO = True
                prop.PATH = Constantes.URL
                PrintLine("test one - Hello word")
                Assert.Pass(Constantes.ASSERT_)

                If prop.EDAD = 35 Then
                    Print("Edad Correcta")
                    Console.WriteLine("Edad Correcta")
                ElseIf prop.ESTATURA > 1.7 Then
                    Print("Estatura Incorrecta")
                    Console.WriteLine("Estatura Incorrecta")
                Else prop.TRABAJO.Equals(False)
                    Print("No tiene trabajo")
                    Console.WriteLine("No tiene trabajo")
                End If
                If prop.SEXO.Length > 1 Then
                    Print("tipo sexo Incorrecto")
                    Console.WriteLine("tipo sexo Incorrecto")
                End If
            Next i

            While prop.Nombre = prop.Nombre
                Console.WriteLine("Continuar while")
            End While

            Dim opt As Integer
            Select Case opt
                Case 1 To prop.EDAD
                    Console.WriteLine("Ingrese una edad")
                Case 2 To prop.SEXO
                    Console.WriteLine("Ingrese un sexo")
                Case 3 To prop.ESTATURA
                    Console.WriteLine("Ingrese una estatura")
                Case 4 To prop.TRABAJO
                    Console.WriteLine("Ingrese si/no")
            End Select

            ' Create an ArrayList and add two elements to it.
            Dim list As New ArrayList
            list.Add(prop.Nombre)
            list.Add(prop.EDAD)
            list.Add(prop.SEXO)
            list.Add(prop.ESTATURA)
            list.Add(prop.TRABAJO)
            ' Use ArrayList as an argument to the method.
            Dim num As Integer
            For Each num In list
                Console.WriteLine(num)
            Next
            Console.WriteLine("Iteración completa")

        End Sub
    End Class

End Namespace
