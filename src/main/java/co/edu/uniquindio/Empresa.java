package co.edu.uniquindio;
import javax.swing.JOptionPane;
import java.time.LocalDate;

public class Empresa {

    // Atributos
    private static String nombreEmpresa = "DevPlus";
    private static String nitEmpresa = "123456";
    private static String direccionEmpresa = "Armenia Quindio";
    private static int telefonoEmpresa = 445566;
    private static String webEmpresa = "www.softwareDevPlus.com";


    private static Cliente[] clientes = new Cliente[50];
    private static int cantClientes = 0;

    private static Desarrollador[] desarrolladores = new Desarrollador[50];
    private static int cantDesarrolladores = 0;

    private static ServicioAdicional[] servicios = new ServicioAdicional[50];
    private static int cantServicios = 0;

    private static Proyecto[] proyectos = new Proyecto[10];
    private static int cantProyectos = 0;

    public static void main(String[] args) {
        int menuInteractivo = 0;

        do {
            String menu =  nombreEmpresa + " Menu Principal \n" +
                    "NIT: " + nitEmpresa + " | Tel: " + telefonoEmpresa + " | Web: " + webEmpresa + "\n\n" +
                    "1. Gestión de Clientes\n" +
                    "2. Gestión de Desarrolladores\n" +
                    "3. Gestión de Servicios Adicionales\n" +
                    "4. Gestión de Proyectos\n" +
                    "5. Consultas Especiales (Teléfono Perfecto e Ingresos)\n" +
                    "6. Salir\n\n" +
                    "Seleccione una opción:";

            String input = JOptionPane.showInputDialog(null, menu);
            if (input == null) break;

            menuInteractivo = Integer.parseInt(input);

            switch (menuInteractivo) {
                case 1: menuClientes(); break;
                case 2: menuDesarrolladores(); break;
                case 3: menuServicios(); break;
                case 4: menuProyectos(); break;
                case 5: menuConsultasEspeciales(); break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (menuInteractivo != 6);
    }


    // CRUD Clientes

    private static void menuClientes() {
        String opcion = JOptionPane.showInputDialog(
                "  Gestion de Clientes  \n" +
                        "1. Registrar Cliente\n" +
                        "2. Mostrar Clientes\n" +
                        "3. Actualizar Cliente\n" +
                        "4. Eliminar Cliente\n" +
                        "5. Volver"
        );
        if (opcion == null) return;

        switch (opcion) {
            case "1":
                if (cantClientes < clientes.length) {
                    String docCliente = JOptionPane.showInputDialog("Documento o NIT:");
                    String nomCliente = JOptionPane.showInputDialog("Nombre o Razón Social:");
                    int telCliente = Integer.parseInt(JOptionPane.showInputDialog("Telefono (sólo números):"));
                    String emailCliente = JOptionPane.showInputDialog("Correo electrónico:");
                    String pais = JOptionPane.showInputDialog("País de procedencia:");

                    clientes[cantClientes] = new Cliente(nomCliente, docCliente, telCliente, emailCliente, pais);
                    cantClientes++;
                    JOptionPane.showMessageDialog(null, "Cliente registrado exitosamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "Capacidad de Clientes alcanzada");
                }
                break;

            case "2":
                if (cantClientes == 0) {
                    JOptionPane.showMessageDialog(null, "No hay clientes registrados.");
                } else {
                    String listaClientes = "   Lista de clientes   \n";
                    for (int i = 0; i < cantClientes; i++) {
                        listaClientes += (i + 1) + ". " + clientes[i].mostrarMensaje() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, listaClientes);
                }
                break;

            case "3":
                String docEdit = JOptionPane.showInputDialog("Ingrese el documento del cliente a modificar:");
                int idClidenteModificado = buscarClientePorId(docEdit);
                if (idClidenteModificado != -1) {
                    clientes[idClidenteModificado].setNombreCliente(JOptionPane.showInputDialog("Nuevo Nombre:", clientes[idClidenteModificado].getNombreCliente()));
                    clientes[idClidenteModificado].setTelefonoCliente(Integer.parseInt(JOptionPane.showInputDialog("Nuevo Teléfono:", clientes[idClidenteModificado].getTelefonoCliente())));
                    clientes[idClidenteModificado].setEmailCliente(JOptionPane.showInputDialog("Nuevo Correo:", clientes[idClidenteModificado].getEmailCliente()));
                    clientes[idClidenteModificado].setPaisCliente(JOptionPane.showInputDialog("Nuevo País:", clientes[idClidenteModificado].getPaisCliente()));
                    JOptionPane.showMessageDialog(null, "Cliente actualizado.");
                } else {
                    JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
                }
                break;

            case "4":
                String idClienteEliminar = JOptionPane.showInputDialog("Ingrese el documento del cliente a eliminar:");
                int documentoClienteEliminar = buscarClientePorId(idClienteEliminar);
                if (documentoClienteEliminar != -1) {
                    for (int i = documentoClienteEliminar; i < cantClientes - 1; i++) {
                        clientes[i] = clientes[i + 1];
                    }
                    clientes[cantClientes - 1] = null;
                    cantClientes--;
                    JOptionPane.showMessageDialog(null, "Cliente eliminado.");
                } else {
                    JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
                }
                break;
        }
    }

    private static int buscarClientePorId(String docCliente) {
        for (int i = 0; i < cantClientes; i++) {
            if (clientes[i].getIdCliente().equalsIgnoreCase(docCliente)) {
                return i;
            }
        }
        return -1;
    }

    // CRUD Desarrolladores

    private static void menuDesarrolladores() {
        String opcion = JOptionPane.showInputDialog(
                "--- GESTIÓN DE DESARROLLADORES ---\n" +
                        "1. Registrar Desarrollador\n" +
                        "2. Mostrar Desarrolladores\n" +
                        "3. Actualizar Desarrollador\n" +
                        "4. Eliminar Desarrollador\n" +
                        "5. Volver"
        );
        if (opcion == null) return;

        switch (opcion) {
            case "1":
                if (cantDesarrolladores < desarrolladores.length) {
                    String codigoDesarrollador = JOptionPane.showInputDialog("Código del desarrollador:");
                    String equipoTrabajo = JOptionPane.showInputDialog("Equipo de trabajo:");
                    String nivelDesarrollador = JOptionPane.showInputDialog("Nivel (Junior, Semisenior, Senior):");
                    int maxProyectos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad maxima de proyectos simultáneos:"));
                    double tarifaDiaria = Double.parseDouble(JOptionPane.showInputDialog("Tarifa por día:"));
                    String estadoDesarrollador = JOptionPane.showInputDialog("Estado (Disponible, Asignado, Ocupado, En capacitacion):");

                    desarrolladores[cantDesarrolladores] = new Desarrollador(codigoDesarrollador, equipoTrabajo, nivelDesarrollador, maxProyectos, tarifaDiaria, estadoDesarrollador);
                    cantDesarrolladores++;
                    JOptionPane.showMessageDialog(null, "Desarrollador registrado exitosamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "Arreglo de desarrolladores lleno.");
                }
                break;

            case "2":
                if (cantDesarrolladores == 0) {
                    JOptionPane.showMessageDialog(null, "No hay desarrolladores registrados.");
                } else {
                    String lista = "   Lista de Desarrolladores  \n";
                    for (int i = 0; i < cantDesarrolladores; i++) {
                        lista += (i + 1) + ". " + desarrolladores[i].mostrarInfo() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, lista);
                }
                break;

            case "3":
                String codEdit = JOptionPane.showInputDialog("Ingrese el codigo del desarrollador a modificar:");
                int desarrolladorModificar = buscarDesarrolladorPorId(codEdit);
                if (desarrolladorModificar != -1) {
                    desarrolladores[desarrolladorModificar].setEquipo(JOptionPane.showInputDialog("Nuevo Equipo:", desarrolladores[desarrolladorModificar].getEquipo()));
                    desarrolladores[desarrolladorModificar].setNivel(JOptionPane.showInputDialog("Nuevo Nivel:", desarrolladores[desarrolladorModificar].getNivel()));
                    desarrolladores[desarrolladorModificar].setTarifaDia(Double.parseDouble(JOptionPane.showInputDialog("Nueva Tarifa/Día:", desarrolladores[desarrolladorModificar].getTarifaDia())));
                    desarrolladores[desarrolladorModificar].setEstado(JOptionPane.showInputDialog("Nuevo Estado:", desarrolladores[desarrolladorModificar].getEstado()));
                    JOptionPane.showMessageDialog(null, "Desarrollador actualizado.");
                } else {
                    JOptionPane.showMessageDialog(null, "Desarrollador no encontrado.");
                }
                break;

            case "4":
                String idDesarrolladorEliminar = JOptionPane.showInputDialog("Ingrese el código a eliminar:");
                int posDel = buscarDesarrolladorPorId(idDesarrolladorEliminar);
                if (posDel != -1) {
                    for (int i = posDel; i < cantDesarrolladores - 1; i++) {
                        desarrolladores[i] = desarrolladores[i + 1];
                    }
                    desarrolladores[cantDesarrolladores - 1] = null;
                    cantDesarrolladores--;
                    JOptionPane.showMessageDialog(null, "Desarrollador eliminado.");
                } else {
                    JOptionPane.showMessageDialog(null, "Desarrollador no encontrado.");
                }
                break;
        }
    }

    private static int buscarDesarrolladorPorId(String cod) {
        for (int i = 0; i < cantDesarrolladores; i++) {
            if (desarrolladores[i].getCodigo().equalsIgnoreCase(cod)) {
                return i;
            }
        }
        return -1;
    }

    // CRUD Servicios Adicionales

    private static void menuServicios() {
        String opcion = JOptionPane.showInputDialog(
                "  GESTIÓN DE SERVICIOS ADICIONALES   \n" +
                        "1. Registrar Servicio\n" +
                        "2. Mostrar Servicios\n" +
                        "3. Actualizar Servicio\n" +
                        "4. Eliminar Servicio\n" +
                        "5. Volver"
        );
        if (opcion == null) return;

        switch (opcion) {
            case "1":
                if (cantServicios < servicios.length) {
                    String cod = JOptionPane.showInputDialog("Codigo del servicio:");
                    String nom = JOptionPane.showInputDialog("Nombre del servicio (Soporte, Capacitación, etc.):");
                    String desc = JOptionPane.showInputDialog("Descripción:");
                    double precioServicio = Double.parseDouble(JOptionPane.showInputDialog("Precio del servicio:"));
                    boolean disponibilidad = JOptionPane.showConfirmDialog(null, "¿Está disponible?", "Disponibilidad", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;

                    servicios[cantServicios] = new ServicioAdicional(cod, nom, desc, precioServicio, disponibilidad);
                    cantServicios++;
                    JOptionPane.showMessageDialog(null, "Servicio adicional registrado.");
                } else {
                    JOptionPane.showMessageDialog(null, "Lista de servicios adicionales llena.");
                }
                break;

            case "2":
                if (cantServicios == 0) {
                    JOptionPane.showMessageDialog(null, "No hay servicios registrados.");
                } else {
                    String lista = "   Lista de Servicios Adicionales  \n";
                    for (int i = 0; i < cantServicios; i++) {
                        lista += (i + 1) + ". " + servicios[i].mostrarInfo() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, lista);
                }
                break;

            case "3":
                String codEdit = JOptionPane.showInputDialog("Ingrese el codigo del servicio a editar:");
                int posEdit = buscarServicioPorCodigo(codEdit);
                if (posEdit != -1) {
                    servicios[posEdit].setNombreServicio(JOptionPane.showInputDialog("Nuevo Nombre:", servicios[posEdit].getNombreServicio()));
                    servicios[posEdit].setPrecioServicio(Double.parseDouble(JOptionPane.showInputDialog("Nuevo Precio:", servicios[posEdit].getPrecioServicio())));
                    JOptionPane.showMessageDialog(null, "Servicio actualizado.");
                } else {
                    JOptionPane.showMessageDialog(null, "Servicio no encontrado.");
                }
                break;

            case "4":
                String idServicioEliminar = JOptionPane.showInputDialog("Ingrese el codigo a eliminar:");
                int posDel = buscarServicioPorCodigo(idServicioEliminar);
                if (posDel != -1) {
                    for (int i = posDel; i < cantServicios - 1; i++) {
                        servicios[i] = servicios[i + 1];
                    }
                    servicios[cantServicios - 1] = null;
                    cantServicios--;
                    JOptionPane.showMessageDialog(null, "Servicio eliminado.");
                } else {
                    JOptionPane.showMessageDialog(null, "Servicio no encontrado.");
                }
                break;
        }
    }

    private static int buscarServicioPorCodigo(String cod) {
        for (int i = 0; i < cantServicios; i++) {
            if (servicios[i].getIdServicio().equalsIgnoreCase(cod)) {
                return i;
            }
        }
        return -1;
    }


    // CRUD Proyctos

    private static void menuProyectos() {
        String opcion = JOptionPane.showInputDialog(
                "--- GESTIÓN DE PROYECTOS ---\n" +
                        "1. Crear Proyecto\n" +
                        "2. Asignar Desarrollador a Proyecto\n" +
                        "3. Agregar Servicio a Proyecto\n" +
                        "4. Cambiar Estado de Proyecto\n" +
                        "5. Listar Proyectos\n" +
                        "6. Volver"
        );
        if (opcion == null) return;

        switch (opcion) {
            case "1":
                if (cantProyectos < proyectos.length) {
                    String cod = JOptionPane.showInputDialog("Codigo del proyecto:");
                    String idCliente = JOptionPane.showInputDialog("Documento del Cliente:");
                    if (buscarClientePorId(idCliente) == -1) {
                        JOptionPane.showMessageDialog(null, "Error: El cliente no existe.");
                        return;
                    }

                    LocalDate fechaSolicitud = LocalDate.parse(JOptionPane.showInputDialog("Fecha de Solicitud (AAAA-MM-DD):"));
                    LocalDate fechaInicio = LocalDate.parse(JOptionPane.showInputDialog("Fecha de Inicio (AAAA-MM-DD):"));
                    LocalDate fechaEntrega = LocalDate.parse(JOptionPane.showInputDialog("Fecha de Entrega (AAAA-MM-DD):"));

                    int diasDesarrollo = Integer.parseInt(JOptionPane.showInputDialog("Días de desarrollo estimado:"));
                    String metodoPago = JOptionPane.showInputDialog("Método de pago (tarjeta de credito, transferencia bancaria o efectivo):");

                    proyectos[cantProyectos] = new Proyecto(cod, fechaSolicitud, fechaInicio, fechaEntrega, "Pendiente", metodoPago, idCliente, diasDesarrollo);
                    cantProyectos++;
                    JOptionPane.showMessageDialog(null, "Proyecto creado con éxito en estado 'Pendiente'.");
                } else {
                    JOptionPane.showMessageDialog(null, "Lista de proyectos llena");
                }
                break;

            case "2": // Asignar Desarrollador
                String idProyecto = JOptionPane.showInputDialog("Codigo del proyecto:");
                int posPDev = buscarProyectoPorCodigo(idProyecto);
                if (posPDev != -1) {
                    String codDev = JOptionPane.showInputDialog("Código del desarrollador a asignar:");
                    int posD = buscarDesarrolladorPorId(codDev);
                    if (posD != -1) {
                        Desarrollador programador = desarrolladores[posD];
                        if (programador.getEstado().equalsIgnoreCase("Disponible")) {
                            if (proyectos[posPDev].agregarDesarrollador(programador)) {
                                JOptionPane.showMessageDialog(null, "Desarrollador asignado correctamente.");
                            } else {
                                JOptionPane.showMessageDialog(null, "No es posible asignar mas desarrolladores");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El desarrollador No está disponible (Estado actual: " + programador.getEstado() + ").");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Desarrollador no encontrado.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Proyecto no encontrado.");
                }
                break;

            case "3": // Agregar Servicio Adicional
                String idServicioAdic = JOptionPane.showInputDialog("Codigo del proyecto:");
                int posPS = buscarProyectoPorCodigo(idServicioAdic);
                if (posPS != -1) {
                    String codS = JOptionPane.showInputDialog("Codigo del servicio adicional:");
                    int posS = buscarServicioPorCodigo(codS);
                    if (posS != -1) {
                        if (servicios[posS].isDisponibleServicio()) {
                            proyectos[posPS].agregarServicio(servicios[posS]);
                            JOptionPane.showMessageDialog(null, "Servicio agregado. Valor total del proyecto actualizado.");
                        } else {
                            JOptionPane.showMessageDialog(null, "El servicio no está disponible.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Servicio no encontrado.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Proyecto no encontrado.");
                }
                break;

            case "4": // Cambiar Estado de Proyecto
                String codPSt = JOptionPane.showInputDialog("Codigo del proyecto:");
                int posPSt = buscarProyectoPorCodigo(codPSt);
                if (posPSt != -1) {
                    String nuevoEstado = JOptionPane.showInputDialog("Nuevo Estado (Pendiente, Confirmado, En curso, Finalizado, Cancelado):");
                    proyectos[posPSt].setEstado(nuevoEstado);

                    if (nuevoEstado.equalsIgnoreCase("Confirmado")) {
                        Proyecto p = proyectos[posPSt];
                        for (int i = 0; i < p.getCantDesarrolladores(); i++) {
                            p.getDesarrolladores()[i].setEstado("Asignado");
                        }
                        JOptionPane.showMessageDialog(null, "Estado actualizado a Confirmado. Desarrolladores pasaron a 'Asignado'.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Estado del proyecto actualizado a " + nuevoEstado);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Proyecto no encontrado.");
                }
                break;

            case "5":
                if (cantProyectos == 0) {
                    JOptionPane.showMessageDialog(null, "No hay proyectos registrados.");
                } else {
                    String lista = " Lista de Proyectos  \n";
                    for (int i = 0; i < cantProyectos; i++) {
                        lista += (i + 1) + ". " + proyectos[i].mostrarInfo() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, lista);
                }
                break;
        }
    }

    private static int buscarProyectoPorCodigo(String cod) {
        for (int i = 0; i < cantProyectos; i++) {
            if (proyectos[i].getCodigoProyecto().equalsIgnoreCase(cod)) {
                return i;
            }
        }
        return -1;
    }


    // Otras consultas

    private static void menuConsultasEspeciales() {
        String opcion = JOptionPane.showInputDialog(
                " Otras consultas   \n" +
                        "1. Consultar Cliente por Teléfono y Validar Número Perfecto\n" +
                        "2. Acumular Ingresos por Fecha de Solicitud (LocalDate)\n" +
                        "3. Volver"
        );
        if (opcion == null) return;

        switch (opcion) {
            case "1":
                int telBuscado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el teléfono del cliente a consultar (sólo números):"));
                int posEncontrado = -1;

                // Busqueda del cliente por telefono
                for (int i = 0; i < cantClientes; i++) {
                    if (clientes[i].getTelefonoCliente() == telBuscado) {
                        posEncontrado = i;
                        break;
                    }
                }

                if (posEncontrado != -1) {
                    boolean esPerfecto = esNumeroPerfecto(telBuscado);
                    String resultado = " Cliente encontrado \n" +
                            clientes[posEncontrado].mostrarMensaje() + "\n\n" +
                            "¿El número de telefono (" + telBuscado + ") es un Numero Perfecto: " +
                            (esPerfecto ? "Si es Numero Perfecto" : "No es Numero Perfecto");
                    JOptionPane.showMessageDialog(null, resultado);
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró ningún cliente registrado con el teléfono " + telBuscado);
                }
                break;

            case "2":
                LocalDate fechaBusqueda = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha de solicitud a consultar (AAAA-MM-DD):"));
                double acumulado = 0;
                int cantProyectosFecha = 0;

                for (int i = 0; i < cantProyectos; i++) {
                    if (proyectos[i].getFechaSolicitud().equals(fechaBusqueda)) {
                        acumulado += proyectos[i].calcularValorTotal();
                        cantProyectosFecha++;
                    }
                }

                JOptionPane.showMessageDialog(null, "--- RESUMEN DE INGRESOS ---\n" +
                        "Fecha consultada: " + fechaBusqueda + "\n" +
                        "Proyectos contratados en la fecha: " + cantProyectosFecha + "\n" +
                        "Valor total acumulado: $" + acumulado);
                break;
        }
    }

    // Numero perfecto
    private static boolean esNumeroPerfecto(int num) {
        if (num <= 0) return false;

        int sumaDivisores = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sumaDivisores += i;
            }
        }
        return sumaDivisores == num;
    }
}




