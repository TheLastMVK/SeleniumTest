
Se aplicó Page Object Model para la estructuración de la prueba
Caracteristica del desarrollo:
    Selenium WebDriver, TestNG, JAVA,
    IntelliJ IDEA, Maven
    Consume driver "chromedriver.exe" ubicación: src\main\resources\drivers\

Estructura principal:

 ---src
    --- test
         ---Java
             --ClassBase
             --ClassPageConfirm
             --ClassPageKid
             --ClassPageLogin
             --ClassPageMen
             --ClassPagePay
             --ClassPageRegister
             --ClassPageWomen
             --ClassTestConfirm
             --ClassTestKid
             --ClassTestLogin
             --ClassTestMen
             --ClassTestPay
             --ClassTestRegister
             --ClassTestWomen
             --SuiteTest
             --SuiteTest.xml  (EJECUTAR)
             --Utils (MODIFICAR EL CORREO ANTES DE EJECUTAR)
---EJERCICIO.mp4 (Se subió un video de demostración de la ejecución de la prueba)

NOTA: Para la creacion de usuario, se tiene que modificar el correo con un correlativo (en UTILS FILA 6) .

----------------------------------------------------------------------------------
1) Generated customer with all customer data
    Se generó prueba automatizada para la creación de nuevo cliente
2) Test steps
3) Open [Home page](https://demo.evershop.io/)
    Se generó prueba automatizada para ingreso inmediato al portal
4) Click *Sign in* button
    Logeo del usuario para la compra de productos
5) Fill *Email address* and *Password* to create an account
   Se generó prueba automatizada para la creación de nuevo cliente
6) Click *Create an account*
   cuenta creada
7) Log in
    paso 4.
8) Select 3 differents products and add it to the cart with different quantities
   Se creó 3 escenarios para la prueba de carrito de compra, con cantidades aleatorias
9) Go to Checkout page and click on Checkout
   Hecho
10) Fill the shipping address and submit
   Cargado de datos del usuario, como telefono, direccion.
11) Click on success to get correct card information
Visualización de los datos al hacer clic en el check visa.
12) Fill payment information

