
/**Importació de la utilitat scanner*/
import java.util.Scanner;

/**
 * @author Marc Llordés <marcllordes@gmail.com>
 */
public class Exercici {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * @param Introduirem
		 *            l'escaner
		 */
		/**
		 * @param Declaració
		 *            variable opcio, per determinar com volem realitzar la conversió,
		 *            en kmh o ms
		 */
		/**
		 * @param Declaració
		 *            variable velocitat, per introduir la velocitat mitjana.
		 */
		/**
		 * @param Declaració
		 *            variable distancia per determinar la distancia recorreguda.
		 */
		/**
		 * @param Declaració
		 *            variable temps per esbrinar el temps total.
		 */
		/**
		 * @param Declaració
		 *            variable per introduir nombre de casos
		 */
		/** Llegir nombre de casos */

		Scanner sc = new Scanner(System.in);

		int opcio;

		double velocitat;

		double distancia;

		double temps;

		int casos;

		casos = sc.nextInt();
		/**
		 * Entrarem al bucle un cop hem introduit el nombre de casos, si es 0 no
		 * entrarem al bucle
		 */
		do {
			for (int i = 0; i < casos; i++) {
				opcio = sc.nextInt();
				/** Si introduim 1 com opció farem calcul en KMH */
				if (opcio == 1) {
					velocitat = sc.nextDouble();
					distancia = sc.nextDouble();
					/** Calcul per a escribar el temps */
					temps = ((distancia / velocitat) * 60);
					/** Mostrar el temps amb dos decimals */
					System.out.println(String.format("%.2f", temps));

				}
				/** Si introduim 2 com opció farem càlcul en MS */
				if (opcio == 2) {
					velocitat = sc.nextDouble();
					distancia = sc.nextDouble();
					/** Calcul per a escribar el temps */
					temps = ((distancia / velocitat) / 60);
					/** Mostrar el temps amb dos decimals */
					System.out.println(String.format("%.2f", temps));
				}

			}
			/** Per cada pasada sumarem 1 al nombre de casos */
			casos++;
		} while (casos == 0);
		/** El programa acabara quan el contador hagi arribat al nombre de casos. */
	}
}
