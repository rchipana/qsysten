# Qsysten

# Backend Java Developer

_Reto Tech - Qsysten_

## Microservicio desarrollado en Java Spring boot

### Endpoint Get

http://localhost:8081/api/v0/qsysten?centro=TRUJILLO

## Se creo un BD h2 en memoria (Persona con dni, paterno, materno)

## Se creo un end point qsystem (GET)

## Se hace una consulta a BD

## Este servicio acepta de parámetro un nombre de centro de distribución (TRUJILLO)

## El resultado es un Json con el nombre del centro distribución

## Devuelve dentro del body (listas desordenadas , listas ordenadas por dni , listas ordenadas por paterno , listas ordenadas por dni y paterno

### Response

{
"trace": {
"traceId": null
},
"status": {
"success": true,
"error": {}
},
"payload": {
"centro": "centro de distribucion TRUJILLO",
"listDesordenada": [
{
"dni": "40119572",
"paterno": "ZEBALLOS",
"materno": "QUINA"
},
{
"dni": "40118515",
"paterno": "PEREZ",
"materno": "JUARES"
},
{
"dni": "40187545",
"paterno": "VERON",
"materno": "QUISPE"
},
{
"dni": "45128956",
"paterno": "MESSI",
"materno": "DUELOS"
},
{
"dni": "52893674",
"paterno": "GUERRERO",
"materno": "NIEVES"
},
{
"dni": "84516295",
"paterno": "SUAREZ",
"materno": "GILO"
},
{
"dni": "97641352",
"paterno": "LOA",
"materno": "LOA"
},
{
"dni": "74515289",
"paterno": "QUISPE",
"materno": "YANQUI"
},
{
"dni": "62125315",
"paterno": "GAMARRA",
"materno": "PALOS"
}
],
"listOrdenadaDni": [
{
"dni": "40118515",
"paterno": "PEREZ",
"materno": "JUARES"
},
{
"dni": "40119572",
"paterno": "ZEBALLOS",
"materno": "QUINA"
},
{
"dni": "40187545",
"paterno": "VERON",
"materno": "QUISPE"
},
{
"dni": "45128956",
"paterno": "MESSI",
"materno": "DUELOS"
},
{
"dni": "52893674",
"paterno": "GUERRERO",
"materno": "NIEVES"
},
{
"dni": "62125315",
"paterno": "GAMARRA",
"materno": "PALOS"
},
{
"dni": "74515289",
"paterno": "QUISPE",
"materno": "YANQUI"
},
{
"dni": "84516295",
"paterno": "SUAREZ",
"materno": "GILO"
},
{
"dni": "97641352",
"paterno": "LOA",
"materno": "LOA"
}
],
"listOrdenadaPaterno": [
{
"dni": "62125315",
"paterno": "GAMARRA",
"materno": "PALOS"
},
{
"dni": "52893674",
"paterno": "GUERRERO",
"materno": "NIEVES"
},
{
"dni": "97641352",
"paterno": "LOA",
"materno": "LOA"
},
{
"dni": "45128956",
"paterno": "MESSI",
"materno": "DUELOS"
},
{
"dni": "40118515",
"paterno": "PEREZ",
"materno": "JUARES"
},
{
"dni": "74515289",
"paterno": "QUISPE",
"materno": "YANQUI"
},
{
"dni": "84516295",
"paterno": "SUAREZ",
"materno": "GILO"
},
{
"dni": "40187545",
"paterno": "VERON",
"materno": "QUISPE"
},
{
"dni": "40119572",
"paterno": "ZEBALLOS",
"materno": "QUINA"
}
],
"listOrdendaDniAndPaterno": [
{
"dni": "40118515",
"paterno": "PEREZ",
"materno": "JUARES"
},
{
"dni": "40119572",
"paterno": "ZEBALLOS",
"materno": "QUINA"
},
{
"dni": "40187545",
"paterno": "VERON",
"materno": "QUISPE"
},
{
"dni": "45128956",
"paterno": "MESSI",
"materno": "DUELOS"
},
{
"dni": "52893674",
"paterno": "GUERRERO",
"materno": "NIEVES"
},
{
"dni": "62125315",
"paterno": "GAMARRA",
"materno": "PALOS"
},
{
"dni": "74515289",
"paterno": "QUISPE",
"materno": "YANQUI"
},
{
"dni": "84516295",
"paterno": "SUAREZ",
"materno": "GILO"
},
{
"dni": "97641352",
"paterno": "LOA",
"materno": "LOA"
}
]
}
}