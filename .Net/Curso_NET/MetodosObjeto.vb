Imports Microsoft.VisualBasic


Namespace Curso_NET

    Public Class Metodos
        Inherits Metodos_two

        Public Sub metodo_Name()
            Dim NameMetodo As String = "metodo1"
            PrintLine(NameMetodo)
            Print("")
            Console.WriteLine(NameMetodo)
        End Sub

        Public Sub metodo_Test(ByVal nameMetod)
            Dim NameMetodo2 As String = nameMetod
            Print(NameMetodo2)
            Console.WriteLine(NameMetodo2)
        End Sub

    End Class

End Namespace
