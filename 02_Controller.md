# Création d'un contrôleur

Le but de cet exercice est de créer un contrôleur dans le but de receuillir les données provenant des smartphones.

La seule chose à faire est d'afficher sur la sortie standard les deux lignes suivantes:

```
2 elements in POST /data:
Data(smartphoneId=f98e9b49-8911-4e87-87f8-723588c2b09e, type=BRIGHTNESS, eventTime=2016-03-22T06:42:06Z, value=18.0)
Data(smartphoneId=f98e9b49-8911-4e87-87f8-723588c2b09e, type=ACCELEROMETER, eventTime=2016-03-22T06:42:06Z, value=-0.19613299;0.1176798;9.80665)
```

Il faudra pour cela utiliser deux fonctionnalités de Kotling:

* [String templates](https://kotlinlang.org/docs/reference/basic-types.html#string-templates)
* [Data Class](https://kotlinlang.org/docs/reference/data-classes.html)

Spring Boot et Jackson sont déjà mis en place et configurés.
