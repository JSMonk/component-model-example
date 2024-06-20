wit_bindgen::generate!({
    path: "wit",
    exports: {
      "cm:example/rust": Component
    },
});

struct Component;

impl exports::cm::example::rust::Guest for Component {
    fn test() -> Result<bool, i32> {
        Err(42)
    }
}
