export interface UsuarioHlrDTO {
  success:      boolean;
  httpStatus:   number;
  errorCode:    null;
  errorMessage: null;
  message:      string;
  body:         Body;
}

export interface Body {
  idUsuario:  string;
  numAbonado: string;
  mnc:        number;
  tipoPlan:   number;
  idEquipo:   number;
  imei:       string;
  estadoVlr:  number;
}


