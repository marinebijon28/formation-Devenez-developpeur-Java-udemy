package com.espacex.decouverte;


import com.espacex.decouverte.enginsspatiaux.TypeVaisseau;
import com.espacex.decouverte.enginsspatiaux.Vaisseau;
import com.espacex.decouverte.enginsspatiaux.VaisseauCivil;
import com.espacex.decouverte.enginsspatiaux.VaisseauDeGuerre;
import com.espacex.decouverte.objetsastro.Galaxie;
import com.espacex.decouverte.objetsastro.Planete;
import com.espacex.decouverte.objetsastro.PlaneteTellurique;

import java.util.Iterator;
import java.util.Scanner;

public class HelloUniverse {
    public static void main(String... args) {

        Planete venus = new PlaneteTellurique("Venus", 1);
        venus.diametre = 12100;
        venus.distanceEtoile = 108.2F;

        Planete mars = new PlaneteTellurique("Mars", 1);
        mars.diametre = 6792;
        mars.distanceEtoile = 227.9F;

       /* com.espacex.com.espacex.com.espacex.decouverte.objetsastro.Atmosphere at = new com.espacex.com.espacex.com.espacex.decouverte.objetsastro.Atmosphere();
        at.constituants.put("CO2", Float.parseFloat("95"));
        at.constituants.put("N2", Float.parseFloat("3"));
        at.constituants.put("AR", Float.parseFloat("1.5"));
        at.constituants.put("NO", Float.parseFloat("0.013"));
        mars.atmosphere = at;*/

        Planete jupiter = new Planete("Jupiter");
        jupiter.diametre = 142984;
        jupiter.distanceEtoile = 778.3F;

        Planete mercure = new PlaneteTellurique("Mercure", 1);
        mercure.diametre = 4880;
        mercure.distanceEtoile = 57.9F;

        Planete saturne = new Planete("Saturne");
        saturne.diametre = 120536;
        saturne.distanceEtoile = 1427.0F;

        Planete uranus = new Planete("Uranus");
        uranus.diametre = 51118;
        uranus.distanceEtoile = 2877.38F;

        Planete terre = new PlaneteTellurique("Terre", 0);
        terre.diametre = 12756;
        terre.distanceEtoile = 149.6F;

        Planete neptune = new Planete("Neptune");
        neptune.diametre = 49532;
        neptune.distanceEtoile = 4497.07F;

        Galaxie galaxy = new Galaxie();
        galaxy.planetes.add(venus);
        galaxy.planetes.add(mars);
        galaxy.planetes.add(jupiter);
        galaxy.planetes.add(mercure);
        galaxy.planetes.add(saturne);
        galaxy.planetes.add(uranus);
        galaxy.planetes.add(terre);
        galaxy.planetes.add(neptune);

       // com.espacex.com.espacex.com.espacex.decouverte.objetsastro.Planete[] planetsorted = (com.espacex.com.espacex.com.espacex.decouverte.objetsastro.Planete[]) galaxy.planetes.toArray();
     //   Collections.sort(galaxy.planetes);

        for (Planete planete : galaxy.planetes) {
            System.out.println(planete.nom);
        }

        /*String symbol;
        Float floatsymbol;
        System.out.println("L'atmosph??re de Mars est compos??e :");
        for (Map.Entry<String, Float> entry: mars.atmosphere.constituants.entrySet()) {
            symbol = entry.getKey();
            floatsymbol = entry.getValue();
            System.out.println(symbol + "% de " + floatsymbol);
        }*/



        Vaisseau civile = null;
        TypeVaisseau vaisseau = null;
        Scanner scan = new Scanner(System.in);
        boolean bool = true;
        String planet = null;
        PlaneteTellurique tellurique = null;
        int quantity = 0;
        String restart = null;
        String type = null;
        Iterator<Planete> it = galaxy.planetes.iterator();
        Planete planete = null;

        do {
            System.out.println("Pour utiliser un vaisseau rentrez son type :");
            type = scan.nextLine();
            vaisseau =  TypeVaisseau.valueOf(type);
            if (vaisseau.nom.equalsIgnoreCase("com.espacex.com.espacex.com.espacex.decouverte.enginsspatiaux.Vaisseau-Monde") ||
                    vaisseau.nom.equalsIgnoreCase("Cargo"))
                civile = new VaisseauCivil(vaisseau);
            else
                civile = new VaisseauDeGuerre(vaisseau);
            civile.nbPassagers = 1;

            System.out.println("Pour accoster une plan??te rentrez son index (Mercure, " +
                    "Venus, Terre, Mars)");
            planet = scan.nextLine();
            switch (planet) {
                case "Mercure" :
                case "Venus" :
                case "Terre" :
                case "Mars" :
                    do {
                        planete = it.next();
                        System.out.println(planete.nom);
                        if (tellurique == null) {
                            if (planet.equalsIgnoreCase(planete.nom)) {
                                tellurique = (PlaneteTellurique)planete;
                                break;
                            }
                        }
                        else {
                            System.out.println(tellurique.nom);
                            if ((planet.equalsIgnoreCase(tellurique.nom) == false) &&
                                    planet.equalsIgnoreCase(planete.nom)) {
                                tellurique = (PlaneteTellurique) planete;
                                break;
                            }
                        }
                    } while (it.hasNext());
                    System.out.println("select :" + tellurique.nom);
                    if (tellurique.restePlaceDisponible(civile)) {
                        tellurique.accueillirVaisseaux(civile);
                        System.out.println("Quelle quantit?? voulez-vous embarquer sur votre vaisseau :");
                        quantity = scan.nextInt();
                        System.out.println(civile.emporterCargaison(quantity));
                        scan.nextLine();
                    }
                    break;
                default :
                    System.out.println("Votre vaisseau ne peut pas accoster");
                    break;
            }
            System.out.println("Voulez-vous recommencer oui/non ?");
            restart = scan.nextLine();
            if (restart.equalsIgnoreCase("non"))
                bool = false;
        } while (bool);
    }
}


