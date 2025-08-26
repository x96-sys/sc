# draft sem compromisso lógico
# draft com compromisso sintático
# comentário começa quando o `#` aparece e termina quando o arquivo termina
# ou quando aparece 0xA; nl; quebra de linha; \nl
# comentário multi linha ainda não é suportado

kernel.buff(a, 0x61)
@b = 0x62;

:if a.gt(b)
  k.printf('b > a; b:[0x%X] a:[0x%X]', b, a)
:ox
  k.printf('a >= b; a:[0x%X] b:[0x%X]', a, b)
;

:if a.gt(b)
  k.printf('b > a; b:[0x%X] a:[0x%X]', b, a)
:af b.gt(a)
  k.printf('a < b; a:[0x%X] b:[0x%X]', a, b)
:ox
  k.printf('a == b; a:[0x%X] b:[0x%X]', a, b)
;


:while a.gt(b)
  b.increase()
  k.printf('a:[0x%X] b:[0x%X]', a, b)
;

:if a.gt(b)
  :return 0
:ox
  :return 1
;
