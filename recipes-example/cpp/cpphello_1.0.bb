DESCRIPTION="bbfile for cpp file "
LICENSE="CLOSED"
SRC_URI="file://hello_cpp.cpp"
S="${WORKDIR}"
do_compile(){
	cd ${S}
	${CXX} ${LDFLAGS} hello_cpp.cpp -o hellocpp

}
do_install(){
	install -d ${D}/usr/bin
	install -m 777 ${S}/hellocpp ${D}/usr/bin

}
