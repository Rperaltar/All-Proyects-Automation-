Imports Microsoft.VisualBasic


Namespace Curso_NET

    Public Class implementClass
        Inherits Constantes

        Implements iMetodos
        Public Sub metodo_One_Interface() Implements iMetodos.metodo_One_Interface
            Dim NameMetodo As String = "metodo1"
            PrintLine(NameMetodo)
            Print("")
            Console.WriteLine(NameMetodo)
        End Sub

        Public Sub metodo_Two_Interface(ByVal nameMetod) Implements iMetodos.metodo_Two_Interface
            Dim NameMetodo2 As String = nameMetod
            Print(NameMetodo2)
            Console.WriteLine(NameMetodo2)
        End Sub

        Public Sub metodo_Three_Interface(ByVal nameMetod) Implements iMetodos.metodo_Three_Interface
            Dim NameMetodo2 As String = nameMetod
            Print(NameMetodo2)
            Console.WriteLine(NameMetodo2)
        End Sub
        Private Property Inter As String
        Public Property getNameInterface() As String Implements iMetodos.getNameInterface
            Get
                Return Inter
            End Get
            Set(value As String)
                Inter = value
            End Set
        End Property

    End Class

End Namespace
