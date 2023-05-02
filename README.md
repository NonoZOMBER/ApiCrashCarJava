# ApiCrashCar

<p align="center">
<img src="https://alegrucoding.com/wp-content/uploads/2021/10/spring_boot.png">
</p>

<p align="end">
ApiCrashCar - Java - SpringBoot - Hibernate
</p>


---

The development of the Rest API is finished, therefore here is the information on the urls to access its repositories.

**Base URL**: `http://domain/crash-car`

| CLASS  | POST  | PUT  | GET  |
| ------------ | ------------ | ------------ | ------------ |
| User  | `/new/user`  | `/update/user/{dni}`  | `/id/user/{dni}`|
| Vehicles  | `new/vehiculo`  |  `/update/vehiculo/{id}`  | `/id/vehiculo/{id}` or `/list/vehiculo/{dni}`  |
| Vehicles Part  | `/new/vehiculo-parte`  | `/update/vehiculo-parte/{id}`  | `/id/vehiculo-parte/{id}`  |
| Secure Vehicles   | `/new/vehiculo-seguro`  | `/update/vehiculo-seguro/{id}`  | `/id/vehiculo-seguro/{id}`  |
| Drivers  | `/new/conductor`  | `/update/conductor/{id}`  | `/id/conductor/{id}`  |
| Parts  | `/new/parte`  |  `/update/parte/{id}` | `/id/parte/{id}` or `/list/partes/{dni}`
| Secure  | `/new/seguro`  | `/update/seguro/{id}`  | `/id/seguro/{id}` or `/list/seguros/{dni}` |


The default port that is set in `application.properties` is 8000 and the host is 0.0.0.0, also the database that this ApiRest consumes is PostgreSQL.

------------

------------
<p align = center>
&copy; Nono
</p>

