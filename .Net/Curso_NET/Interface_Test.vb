Imports NUnit.Framework

Namespace Curso_NET

    Public Class InterfaceTest


        <SetUp>
        Public Sub Setup()
        End Sub

        <Test>
        Public Sub TestObject()

            Dim i As New implementClass()
            i.getNameInterface = ""
            i.metodo_One_Interface()
            i.metodo_Two_Interface("")
            i.metodo_Three_Interface("")
            i.metodo_Estudios()
            i.metodo_Test(Constantes.URL)
            i.metodo_Escuela()

            If i.getNameInterface = i.getNameInterface Then
                Console.WriteLine("")
            End If

            While i.getNameInterface = ""
                Console.WriteLine("")
            End While

        End Sub
    End Class

End Namespace
