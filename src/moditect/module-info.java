// Generated 22-Jan-2020 using Moditect maven plugin
module com.fasterxml.jackson.datatype.threetenbp {
    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
    requires org.threeten.bp;

    exports com.fasterxml.jackson.datatype.threetenbp;
    exports com.fasterxml.jackson.datatype.threetenbp.deser;
    exports com.fasterxml.jackson.datatype.threetenbp.deser.key;
    exports com.fasterxml.jackson.datatype.threetenbp.function;
    exports com.fasterxml.jackson.datatype.threetenbp.ser;
    exports com.fasterxml.jackson.datatype.threetenbp.ser.key;

    provides com.fasterxml.jackson.databind.Module with
        com.fasterxml.jackson.datatype.threetenbp.ThreeTenModule;
}