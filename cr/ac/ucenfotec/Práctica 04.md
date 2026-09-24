Práctica de Programación

Esta práctica se puede realizar de forma individual o en parejas. No se permite más de dos personas en ningún caso.

Instrucciones generales para todos los ejercicios

Para cada ejercicio, entregue los tres componentes siguientes:

1.  Tabla Entradas / Salidas en hoja de cálculo (Excel / Calc):
    *   Identifique las celdas de Entrada, los cálculos intermedios (Proceso) y los resultados finales (Salida).
2.  Pseudocódigo o diagrama de flujo:
    *   Diseñe la estructura lógica utilizando bloques condicionales (`if / elif / else`).
    *   Revise las expresiones booleanas: siempre que sea posible, utilice expresiones booleanas compuestas en lugar de condicionales anidados.
    *   Si existen condiciones que requieran ifs anidados, esto está permitido.
3.  Código en Java:
    *   Programa estructurado en Java, aplicando las buenas prácticas del curso (nombres de variables en `lowerCamelCase`, tipado claro).

Validación de Salida al Cine

Evalúe una toma de decisión cotidiana más sencilla mediante una estructura de decisión básica.

Un grupo de amigos desea decidir si irá al cine el fin de semana. La salida se considera aprobada únicamente si se cumplen dos condiciones simultáneas:

*   Tener un presupuesto individual mayor o igual a ₡8.000.
*   Que haya boletos disponibles para la función seleccionada.

Si la salida es aprobada, el programa debe mostrar el mensaje `"¡Salida confirmada al cine!"`; de lo contrario, debe mostrar `"Salida cancelada: se quedan en casa"`.

Planificación y Aprobación de un Paseo Familiar

Una familia desea realizar un paseo de fin de semana a la playa y necesita un programa que evalúe si la salida es viable y determine la logística del viaje.

Para que el paseo sea confirmado, el sistema exige que se cumplan simultáneamente dos criterios principales:

1.  Requerimientos climáticos: la temperatura pronosticada debe ser igual o superior a 25 °C, y el estado del clima debe reportarse como "soleado" o "despejado".
2.  Requerimientos financieros: debe contarse con un presupuesto disponible mayor o igual a ₡50.000 en efectivo, o bien poseer una tarjeta de crédito activa para el viaje.

Si el viaje cumple con ambos requerimientos principales, el paseo queda confirmado. A continuación, se evalúa la disponibilidad del vehículo familiar para definir el transporte: si el carro tiene al menos el 75% del tanque lleno y la revisión técnica al día, el viaje se realiza en Vehículo Propio (Ruta Directa); de lo contrario, se reserva Autobús de Línea (Transporte Público).

Si el viaje no cumple con los requerimientos principales, la salida se cancela. En este escenario, el sistema analiza el motivo de la cancelación: si el pronóstico emite una alerta por "tormenta tropical", o si algún integrante reporta enfermedad, se clasifica como "Cancelación Definitiva por Fuerza Mayor"; en caso contrario, se clasifica como "Paseo Pospuesto por Condiciones Inadecuadas".

Clasificación del Consumo Eléctrico (Estructura if / else if)

Contexto y Objetivo

Antes de desarrollar el cálculo completo de la factura eléctrica, diseñe un programa que determine la categoría de consumo de un hogar según los kilovatios-hora (kWh) consumidos durante el mes. Este ejercicio debe resolverse utilizando condicionales anidados por la izquierda / escalonados (`if / elif / else`).

Reglas de Clasificación por Rangos

Consumo Mensual (kWh)

Categoría Asignada

Menor o igual a 30 kWh

Consumo Mínimo / Básico

De 31 a 200 kWh

Consumo Moderado

De 201 a 300 kWh

Consumo Alto

Más de 300 kWh

Consumo Excesivo

El programa debe solicitar el consumo mensual en kWh e imprimir la categoría correspondiente evaluando las condiciones en orden consecutivo (de menor a mayor o viceversa).

Cálculo del Recibo Eléctrico Residencial (CNFL)

Contexto

En Costa Rica, la Compañía Nacional de Fuerza y Luz (CNFL) calcula la factura eléctrica residencial según el número de kilovatios-hora (kWh) consumidos en el mes. Además del consumo de energía, la factura incluye otros rubros de ley: el Alumbrado Público, el Impuesto de Bomberos y el IVA.

Reglas básicas de cálculo

1\. Cargo por energía (bloques escalonados)

El cobro de la energía se realiza por tramos acumulativos:

Tramo

Consumo

Tarifa

Cargo mínimo

0 a 30 kWh

Monto fijo de ₡1.744,80

Bloque 2

31 a 200 kWh

₡58,16 por kWh en el rango

Bloque 3

201 a 300 kWh

₡89,24 por kWh en el rango

Bloque 4

Más de 300 kWh

₡92,27 por cada kWh sobre 300

2\. Alumbrado Público

Se cobra ₡3,02 por cada kWh consumido, desde el primer kWh.

3\. Tributo a Bomberos (1,75%)

*   Exención: si el consumo es de 100 kWh o menos, está exento (₡0).
*   Si el consumo es mayor a 100 kWh, se paga 1,75% sobre el Subtotal de Energía.
*   Límite: el impuesto se aplica como máximo sobre los primeros 1750 kWh.

4\. Impuesto al Valor Agregado (IVA – 13%)

*   Exención: si el consumo es menor a 280 kWh, está exento (₡0).
*   Si el consumo es de 280 kWh o más, se paga 13% sobre la suma de: Subtotal Energía + Alumbrado Público + Tributo Bomberos.

5\. Total facturado

Total a pagar = Subtotal Energía + Alumbrado Público + Tributo Bomberos + Monto IVA

6\. Formato de salida requerido

La salida del programa en Python debe presentarse como un desglose detallado, estilo factura, donde cada rubro y el total queden correctamente alineados y formateados como moneda con dos decimales (`:12.2f` o similar). Se recomienda consultar la guía de formato en [PyFormat (pyformat.info)](https://pyformat.info/).

Tip: para las líneas separadoras puede usar la repetición de cadenas de Python, por ejemplo `'-' * 50` genera un string de 50 guiones seguidos.

Ejemplo de formato de salida:

\==================================================
        DESGLOSE DE FACTURA ELÉCTRICA (CNFL)
==================================================
Consumo mensual:                    250.00 kWh
--------------------------------------------------
Subtotal Energía:              ₡     16,094.00
Alumbrado Público:             ₡        755.00
Tributo a Bomberos (1.75%):    ₡        281.65
Impuesto IVA (13%):            ₡          0.00
--------------------------------------------------
TOTAL A PAGAR:                 ₡     17,130.65
==================================================

Entregables específicos de este punto

Tabla de validación:

Calcule y verifique los montos para los siguientes consumos mensuales, en kWh: 25, 30, 100, 200, 250, 300, 400.