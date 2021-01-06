Initialisation à la programmation avec JAVA 
*******************************************
Exercice réalisé dans le cadre de ma formation Développeur Web/Web mobile avec ENI Ecole Informatique  
Novembre 2020  
*******************************************
Les fondamentaux du langage JAVA   
TP Bulletin simple 
Durée estimée : 30 minutes  
IDE : Eclipse  
*******************************************
__Énoncé de l'exercice__

Rédiger le programme qui permet de calculer et d’afficher le bulletin de salaire simplifié
d’un employé.  
Les nom, prénom et statut (cadre, agent de maîtrise, employé de bureau) sont des
informations obligatoirement mentionnées sur le bulletin de salaire d’un employé.  
L’utilisateur doit saisir le nom, le prénom, le statut ainsi que le nombre d’heures effectuées
par un employé.  

Calcul du salaire de base :
Le salaire de base dépend du nombre d’heures travaillées en tenant compte des critères
suivants :
- de 0 à 169 heures : le salaire mensuel est égal au nombre d’heures travaillées
multiplié par le taux horaire
- de 169 à 180 heures : le taux horaire est majoré de 50 %
- au-delà de 180 heures : le taux horaire est majoré de 60 %

Calcul des cotisations salariales:
1. Contribution pour le Remboursement de la Dette Sociale et Contribution SOciale Généralisée imposable : Salire net (€) * 3.49%
2. Contribution Sociale Généralisée non imposable : Salaire net (€) * 6.15%  
3. Assurance maladie : Salaire net (€) * 0.95%  
4. Assurance vieillesse : Salaire net (€) * 8.44%  
5. Assurance chômage : Salaire net (€) * 3.05%  
6. Retraite complémentaire (IRCEM) : Salaire net (€) * 3.81%  
7. Cotisation AGFF : Salaire net (€) * 1.02%  
TOTAL DES COTISATIONS SALARIALES : 1 + 2 + 3 + 4 + 5 + 6 + 7 (€)


Calcul du salaire à verser :
La prime est calculée en fonction du nombre d’enfants selon les règles suivantes :  
- 0 enfant : pas de prime  
- 1 enfant : 20€ de prime  
- 2 enfants: 50€ de prime  
- Plus de 2 enfants : 70€ + 20€ par enfants au-dessus de 2  

Le calcul du montant net à payer s’effectue suivant la règle suivante :  
Net à payer = Salaire de base – Total des cotisations salariales + Prime
