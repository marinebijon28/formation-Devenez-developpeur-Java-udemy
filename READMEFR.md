
## section 1 : A la rencontre de Java
Les langages de programmations sont une passerelle entre le langage machine et le langage humain. Les langages de programmation les convertissent en langage machine. On retrouve java dans toues les machine du quotidien. Java a été inventé en 1994 par la défunte entreprise Sun Microsystems crée par James Gosling. Puis elle a été racheté en 2010 par Oracle qui commercialise le système de gestion MySQL ou openOffice.

# règles
java est sensible à la casse !
mettre un espace entre les parenthèses et les crochets
attention aux indentations par rapport aux scopes 
auto indent sur visual studio code
le ; marque la fin d'une indentation
un saut de ligne après chaque instructions

# Java comment ça marche
- la première étape de compilation java devient du byte code nom.class sont les fichier byte code
- la deuxième étape qui est l'interprétation interprétation 

contrairement au langage C qui compile ou au JavaScript qui est un langage interpréter 

la compilation ce fait grâce à un programme javac.exe | .sh
l'interprétation ce fait grâce par l'interpréteur java.exe | .sh

Le byte code est le même pour tous le monde.
C'est l'interpréteur qui change en fonction de l'OS

# Avantage :
- Java est disponible partout pas besoin d'avoir votre oridnateur.

# Les inconvénients :
- vous avez besoin d'internet.
- la performance
- la fiabilité

# Racourcie
sout = Sout.out.println() affiche ce qu'il entre les parenthéses avec un saut de ligne

# IDE Java
- Eclipse gratuit
- NetBeans (2 form opensource par apache ou propriétaire par oracle)
- IntelliJ (community gratuit)

Grâce à l'ide on peut voir des erreurs : des erreurs syntaxiques ou des problèmes de compilation

## Section 2 : Travailler avec Java pour de vrai
# Environnement Java
JDK = java development kit
JVM = Java virtual Machine == environnement java + autres == JRE = Java Runtime Environment

# ordre environnement
- JDK
- JRE
- JVM

## Section 3 : Les variables

## La notion de variable
Les variables sont des valeurs fixes dans la mémoire vive individuellement. Nous avons également besoin de valeur variable. Une variable est un espace de stockage dans la mémoire vive est dont le contenu est variable. Il faut voir la variable comme une boîte cette boite dont le contenu peut changer et cette boîte va exister à part entière dans la mémoire vive à côté dans les boîtes précédemment ajouté ou des autres boites futur. Nous développeurs nous allons pouvoir manipuler cette espace mémoire en lui donnant simplement un nom 

# règles
- standard camel case : elle commence toujours caractère en minuscule
- elle doit être écrit en anglais
- vous ne pouvez pas utiliser de mot clé : public, class, static, void;
- vous ne pouvez pas mettre d'espace dans le nom de la variable
- vous ne pouvez pas commencer par un chiffre
- une variable est typé et ne peut contenir que des valeurs de son type

## La déclaration des variables : les types primitifs
Java dit langage à typage fort. Cela veut dire que tous les types de variables en plus d'avoir un nom et une valeur dispose obligatoirement une information sur le type de donnée qu'elle va contenir. Le type permet à Java d'allouer la mémoire suffisante pour contenir la donnée
On prend une boite où on colle une petite étiquette sur ce qu'elle pourra contenir.
Si un type est trop petit on peut le déclarer par un type qui permet d'accueillir un nombre plus grand par exemple un int peut êre typé en long qui est perdu sur 64 bits.

type ageDuCapitain;
La déclaration du type se place devant le nom de la variable séparée par un espace

# type primitif
Les types primitifs commencent par une minuscule
- char qui contient un caractère

- float nombre a virgule de grande valeur
- double nombre a virgule plus grand que le float

- byte qui veut dire octect c'est-à-dire 8 bits (limite des valeurs : -128 à 127)
- short coder 16 bits (limite des valeurs : -32768 à 32767)
- int est diminutif d'integer pour un entier de (limite des valeurs : -2147483648 à 2147483647). L'entier est code par une suite binaire de 32 bits.
- long coder sur 64 bits

- boolean (vrai ou faux)

## Affecter une valeur
int anneeDeNaissance;
Déclaration de la variable

anneeDeNaissance = 1977;
Affectation d'une valeur àla variable

int anneeDeNaissance = 1978;
Déclaration et affectation

On peut changer la valeur d'une variable avec une affectation, mais on ne peut pas redéclarer une variable 

# Pour affecter certaines valeurs
long millisecondesDepuis01011970 = 1609920618000L;
Quand on affecte une valeur à une variable cette valeur existe également à part entière dans la mémoire.
Par défaut, lorsque vous écrivez une valeur de numérique. Java la considère comme un entier de type int.
Il va falloir forcer Java à mettre cette valeur dans un espace mémoire qui permet de la stocker en lui disant explicitement que nombre à ce type en le suffixant par la première lettre de son type.

C'est pareil pour les types float et double. Par défaut, il crée un double et il faut lui préciser que c'est un type float.

Pour les caractères, il faut entourer le caractère par des simples quotes. Java va d'abord crée caractère puis le mettre en mémoire puis le positionner dans cet emplacement mémoire. Il n'y a qu'un seul caractère exception faite des caractères unicodes ou la table unicode

## Le mot clé var
Le mot clé var a été ajouté en Java version 10. Cela fonction pour tous type de variable en Java, mais il faut lui affecter une valeur pendant la déclaration.

## Résoudre les erreurs de codage
Il y a trois types d'erreurs :
- le type d'erreur lors de la compilation
- le type d'erreur à l'interprétation
- le type d'erreur de logique

Il y a les erreurs d'exécution et celles que l'on doit chercher soi-même. 

# Erreur de compilation
Il y a des erreurs de syntaxe qui rendent impossible la compilation. On peut voir une petite ampoule rouge pour permettre de régler les erreurs syntaxiques. 

# Erreur d'interprétation
int nbPlanet = 8 / 0;
En mathématique, on ne peut pas diviser par 0. Le compilateur java ne va pas le voir. Le message d'erreur est une Stacktrace (en français pile d'exécution). Il faut toujours lire la première ligne qui explique l'erreur. La suite est l'historique du programme per là où est passé l'erreur. Elle donne les lignes de l'historique du programme liée cette erreur.

# Erreur de logique
Il se peut que le code ne fonctionne pas avec des exigences fonctionnelles. On parle des erreurs logiques


## Les chaines de caractère, première approche
Pour déclarer une chaine de caractère on utilise le type String. String est écrit avec un grand S qui veut dire que c'est un type objet. On utilise les guillemets pour déclarer une chaine de caractère qu'on appelle double quotes


# type object
- Char
- String

- Float
- Double

- Byte
- Short
- Integer
- Long

- Boolean




