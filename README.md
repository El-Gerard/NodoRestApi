# NodoRestApi

Nodo que hará parte de una red distribuida. 

El nodo consta de 3 recursos:

getSuma: Recibe por parámetros string un número para ser almacenado localmente en el nodo. Éste recurso retorna en modo text/plain el acumulado de numeros hasta el momento.


agregarNodo: Recibe por parámetros string la dirección URI del nuevo nodo al que se deberá conectar: http://IP:puerto/proyecto/applicationPath.


consultarSuma: Consulta a cada nodo almacenado el número que ha guardado hasta el total y lo suma al número local. Su respuesta será en text/plain con la totalidad de la suma de todos los nodos.
