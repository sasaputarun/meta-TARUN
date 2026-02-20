DESCRIPTION="bbfile for hello c "
LICENSE="CLOSED"
SRC_URI="file://hello.c"
S="${WORKDIR}"
do_compile(){
	cd ${S}
	${CC} ${LDFLAGS} hello.c -o hii
}
do_install(){
	install -d ${D}/usr/bin
	install -m 777 ${S}/hii ${D}/usr/bin
}
