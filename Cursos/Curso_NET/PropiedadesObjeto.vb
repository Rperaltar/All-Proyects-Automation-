Imports Microsoft.VisualBasic


Namespace Curso_NET
    Public Class Propiedades
        Inherits Constantes

        Private NAME As String
        Public Property EDAD As Integer
        Public Property SEXO As String
        Public Property ESTATURA As Double
        Public Property TRABAJO As Boolean

        Public Property Nombre() As String
            Get
                Return NAME
            End Get
            Set(ByVal value As String)
                NAME = value
            End Set
        End Property
    End Class

End Namespace