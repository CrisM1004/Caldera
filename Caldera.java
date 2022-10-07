/**
 * Clase que gestiona los gastos de campanya de
 * una caldera de comunitaria sin contadores.
 * Permite analizar gastos y hacer una regularizacion
 * informando cuanto se tiene que devolver o
 * cuanto mas tiene que pagar cada vecino.
 * 
 * @author Crismeiry Calcaño
 * @version 1.0
 */
public class Caldera {
    
    // TODO: CONSTANTES
   

    /** El IVA se aplica a todos los gasto. */
    
    /** El impuesto de hidrocarburos solo se aplica al gas, ademas del iva. */
    private double IMP_IVA = 0.22;
    private double IMP_HIDROCARBUROS = 0.20;

    // Conceptos gastos
     private char AGUA = 'A';
     private char LUZ = 'L';
     private char NADA = 'N';

    // Ningun mes
    private int NINGUNO = 0;
    

    // Periodos
    private int PERIODO_OCTUBRE_DICIEMBRE = 1;
    private int PERIODO_ENERO_MARZO = 2;
    private int PERIODO_ABRIL_JUNIO = 3;
    private int PERIODO_JULIO_SEPTIEMBRE = 4;
    
    // TODO: VARIABLES DE CLASE (PROPIEDADES/ATRIBUTOS)
    private int mesMasGasto;
    private double conceptoMasGasto;
    private int periodoMasMantenimiento;
    // vecinos y presupuesto
    private int vecinos;
    private double presupuesto;

    // acumulados
    private double acumuladoConsumo;
    private double acumuladoMantenimiento;
    private int gastoAgua;
    private int gastoLuz;
    // estadisticas
    private double maxConsumo;
    private double maxPrecio;
    private double minPrecio;
    private double maxMantenimiento;
    private double maxGasto;
    private int mesMasConsumo;
    private int mesMasBarato;
    private int mesMasCaro;
    
    // TODO: constructores
    
    /**
     * Constructor de la clase Caldera. Inicializa los atributos.
     */
     public Caldera(){
        vecinos = 0;
        presupuesto = 0;
        acumuladoMantenimiento = 0;
        gastoAgua = 0;
        gastoLuz = 0;
        mesMasConsumo = 0;
        maxConsumo = 0;
        mesMasCaro = 0;
        maxPrecio = 0;
        mesMasBarato = 0;
        minPrecio = 0;
        periodoMasMantenimiento = 0;
        maxMantenimiento = 0;
        mesMasGasto = 0;
        maxGasto = 0;
        conceptoMasGasto = 0;
        PERIODO_OCTUBRE_DICIEMBRE = NINGUNO;
        PERIODO_ENERO_MARZO = NINGUNO;
        PERIODO_ABRIL_JUNIO = NINGUNO;
        PERIODO_JULIO_SEPTIEMBRE = NINGUNO;
        AGUA = NADA;
        LUZ = NADA;
        }

    /**
     * Constructor de la clase Caldera. Inicializa los atributos.
     * 
     * @param queVecinos     Numero de vecinos que conforman la comunidad
     * @param quePresupuesto Presupuesto inicial con el que se pretende afrontar los
     *                       gastos
     */
     public Caldera(int cuantosVecinos,double quePresupuesto ,double queAcumuladoConsumo , double queAcumuladoMantenimiento, int queGastoAgua,int queGastoLuz ,int cualMesMasConsumo , double cualMaxConsumo,int cualMesMasCaro ,double cualMaxPrecio, int cualMesMasBarato , double cualMinPrecio , int quePeriodoMasMantenimiento ,double cualMaxMantenimiento , int cualMesMasGasto , double cualMaxGasto , double cualConceptoMasGasto){
        vecinos = cuantosVecinos ;
        presupuesto = quePresupuesto;
        acumuladoConsumo = queAcumuladoConsumo;
        acumuladoMantenimiento = queAcumuladoMantenimiento;
        gastoAgua = queGastoAgua;
        gastoLuz = queGastoLuz;
        mesMasConsumo = cualMesMasConsumo;
        maxConsumo = cualMaxConsumo;
        mesMasCaro = cualMesMasCaro;
        maxPrecio = cualMaxPrecio;
        mesMasBarato = cualMesMasBarato;
        minPrecio = cualMinPrecio;
        periodoMasMantenimiento = quePeriodoMasMantenimiento;
        maxMantenimiento = cualMaxMantenimiento;
        mesMasGasto = cualMesMasGasto;
        maxGasto = cualMaxGasto;
        conceptoMasGasto = cualConceptoMasGasto;
        }
     

    
    // TODO: getters y setters
    
    /**
     * Fija el valor del presupuesto
     * 
     * @param quePresupuesto Valor del presupuesto, ej. 38638
     */
     public void setPresuesto( int cuantoDinero){
        presupuesto = cuantoDinero;
        }

    /**
     * Obtiene el valor del presupuesto
     * 
     * @return valor del presupuesto, ej. 38638
     */
    
     public double getPresupuesto(){       
        return presupuesto;
        }
    /**
     * Fija el numero de vecinos de la comunidad
     * 
     * @param queVecinos numero de vecinos, ej. 48
     */
     public void setVecinos(int cuantovecinos){
        vecinos = cuantovecinos;      
        }

    /**
     * Obtiene el numero de vecinos
     * 
     * @return numero de vecinos, ej. 48
     */
     public int getVecinos(){
         return vecinos;
        }

    /**
     * Cantidad de gas consumido cada mes al precio de mercado
     * 
     * @param mes    Numero de mes, 1 es enero, 2 febrero, ..., 12 diciembre, ej. 9
     * @param gas    Cantidad de gas consumido en KWh, ej. 15496
     * @param precio Precio en Euros al que se ha conseguido el gas, ej. 0.067668
     */
    public void consumo(int mes, int gas, double precio) {
        // TODO: consumo
    }

    /**
     * Gasto de mantenimiento en cada periodo
     * 
     * @param periodo Numero que representa el periodo, ej. OCTUBRE-DICIEMBRE es 1
     * @param importe Valor del gasto de mantenimiento
     */
    public void mantenimiento(int periodo, double importe) {
        // TODO: mantenimiento
    }

    /**
     * Gasto mensual en concepto de agua o luz.
     * 
     * @param mes      Numero del mes, ej. ENERO es 1
     * @param concepto Agua 'A' o luz 'L'
     * @param importe  Valor del gasto, ej. 189.03
     */
    public void gasto(int mes, char concepto, double importe) {
        // TODO: gasto
    }

    /**
     * Imprime el resultado del periodo, ej.
     * 
     * ==================
     * RESULTADO GLOBAL
     * ==================
     * Presupuesto: 38638.0
     * Consumo gas: 61688.26
     * Impuestos g.: 25909.07
     * Mantenimiento: 4157.58
     * Iva manto.: 914.67
     * Gasto agua: 2647.83
     * Iva agua: 582.52
     * Gasto luz: 4663.01
     * Iva luz: 1025.86
     * ------------------
     * TOTAL : -62950.8 Euros.
     * ------------------
     * ==================
     * RESULTADO X VECINO
     * ==================
     * Vecinos: 48
     * Aporte v.: 804.96
     * Gasto v.: 2116.43
     * Resultado: -1311.47
     * ------------------
     * El resultado ha sido NEGATIVO,
     * se tiene que pagar 1311.47 Euros.
     * El pago se pasara en
     * 5 cuotas de 262.29 Euros.
     * ------------------
     */
    public void printResultados() {
        // TODO: printResultados
    }

    /**
     * Imprime las estadisticas del periodo, ej.
     * 
     * ==================
     * ESTADISTICAS
     * ==================
     * Max. consumo: ENERO 12527.66
     * Mes mas caro: AGOSTO 0.202504
     * Mes mas barato: SEPTIEMBRE 0.067668
     * Mayor gasto en: ABRIL 679.94 LUZ
     * P. mas manto.: OCTUBRE-DICIEMBRE 1552.1
     * ------------------
     */
    public void printEstadisticas() {
        // TODO: printEstadisticas
    }

    /**
     * Devuelve el nombre del mes asociado a su valor numerico
     * 
     * @param numMes Numero del mes del 1 al 12, ej. 1
     * @return Nombre del mes, ej. ENERO
     */
    public String getNombreMes(int numMes) {
        // TODO: getNombreMes
        return "";        
    }

    /**
     * Devuelve el nombre del concepto asociado al caracter
     * 
     * @param concepto Valor caracter, ej. 'L'
     * @return Nombre del concepto, ej. 'LUZ'. Si no es agua o luz devuelve "NADA"
     */
    public String getNombreConcepto(char concepto) {
        // TODO: getNombreConcepto
        return "";        
    }

    /**
     * Devuelve el nombre del periodo asociado a su numero
     * 
     * @param numPeriodo Numero de periodo, del 1 al 4, ej. 4
     * @return Nombre del periodo con nombres de los meses separados por guion, ej.
     *         "OCTUBRE-DICIEMBRE". Sino devuelve "NINGUN PERIODO"
     */
    public String getNombrePeriodo(int numPeriodo) {
        // TODO: getNombrePeriodo
        return "";        
    }

    /**
     * Analiza el resultado, si el valor es negativo se tendra que pagar si es
     * positivo se devolvera.
     * En el caso negativo se debera pagar de una vez si el importe en menor o igual
     * que 200,
     * en multiplos de 200 y el resto si el resultado es menor o igual que 600 o
     * en 5 partes alicuotas sino.
     * 
     * @param resultado cantidad positiva o negativa, ej. -1311.47
     * @return Mensaje con la informacion sobre el pago. Ej.
     *         </br>
     *         El resultado ha sido NEGATIVO,
     *         se tiene que pagar 114.56 Euros.
     *         El pago se pasara en un solo cobro.
     *         </br>
     *         El resultado ha sido NEGATIVO,
     *         se tiene que pagar 513.33 Euros.
     *         El pago se pasara en
     *         2 cuotas de 200 Euros y
     *         otro cobro de 113.33 Euros.
     *         </br>
     *         El resultado ha sido NEGATIVO,
     *         se tiene que pagar 1311.47 Euros.
     *         El pago se pasara en
     *         5 cuotas de 262.29 Euros.
     *         </br>
     *         El resultado ha sido POSITIVO,
     *         se devolvera 45.52 Euros.
     *         El pago se realizara en breve en
     *         una transferencia.
     */
    public String analisisResultado(double resultado) {
        // TODO: analisisResultado
        return "";
    }

    /**
     * Redondea un valor de tipo double a dos decimales.
     * Al imprimirlo se vera al menos un decimal y como mucho dos.
     *
     * @param valor Numero con decimales de tipo double
     * @return Redondeo con 1 o 2 decimales, ej.
     *         38638 -> 38638.0
     *         61688.255730000004 -> 61688.26
     *         25909.067406600003 -> 25909.07
     *         -62950.79553660001 -> -62950.8
     *         -1311.4749070125 -> -1311.47
     */
    public double redondeo2decimales(double valor) {
        // TODO: redondeo2decimales
        return 0;
    }

    /**
     * Divide un numero decimal entre un numero entero y devuelve el resultado
     * entero.
     * 
     * @param dividendo Numero con decimales que se divide, ej. 647.55
     * @param divisor   Numero entero que divide, ej. 200
     * @return Cociente, numero entero, cuantos divisores caben en el dividendo, ej.
     *         3
     */
    public int divisionEntera(double dividendo, int divisor) {
        // TODO: divisionEntera
        return 0;
    }

    /**
     * Divide un numero decimal entre un numero entero y devuelve el resto con
     * decimales.
     * 
     * @param dividendo Numero con decimales que se divide, ej. 647.55
     * @param divisor   Numero entero que divide, ej. 200
     * @return Resto con decimales, ej. 47.55
     */
    public double restoDivisionEntera(double dividendo, int divisor) {
        // TODO: restoDivisionEntera
        return 0;
    }

}
