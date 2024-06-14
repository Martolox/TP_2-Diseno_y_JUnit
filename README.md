# TP 2 - Diseño y Testing Automatizado con Junit

- Dependencias:
    - JUnit5
    - Jakarta Mail
- Inyección de Dependencias
- Depender de Abstraccines
- Fake Objects
- Uso MailTrap

## 1. Sistema de Concursos

Guardar inscripción en un archivo de texto con fecha/hora e IDs.  
Formato:  
`dd/mm/yyyy, id_participante, id_concurso`

## 2. Costes en Restaurante

Guardar costo en un archivo de texto con fecha/hora y el monto total.  
Formato:  
`dd/mm/yyyy || 1100`


## 3. Registros

Guardar los registros del ejercicio 1 y 2 en una tabla de una base de datos relacional.
Desde Main, se debe poder instanciar la inscripción o venta en un archivo de texto o en base de datos.

## 4. Email

Cuando se registre una persona en un concurso (ejercicio 1), enviar un email.
Uso de MailTrap.

## 5. Fakes

Correr tests sin escribir en disco, base de datos o enviar email (Fake Object).