// Generated by `wit-bindgen` 0.24.0. DO NOT EDIT!

@file:OptIn(UnsafeWasmMemoryApi::class)
import kotlin.wasm.unsafe.*


@WasmImport("cm:example/rust", "test")
internal external fun __wasm_import_test(p0: Int): Unit



@WasmExport("cm:example/rust#test")
fun __wasm_export_test(): Int {
  freeAllComponentModelReallocAllocatedMemory()
  withScopedMemoryAllocator { allocator -> 

  val result: Result<Boolean> = RustExportsImpl.test()

  val ptr = /* RETURN_ADDRESS_ALLOC(size=8, align=4)*/ allocator.allocate(8).address.toInt()
  if (result.isFailure) {
    val payload0 = (result.exceptionOrNull() as ComponentException).value as Int
    (ptr + 0).ptr.storeByte(1.toByte())
    (ptr + 4).ptr.storeInt(payload0)
  } else {
    val payload = result.getOrThrow()!!
    (ptr + 0).ptr.storeByte(0.toByte())
    (ptr + 4).ptr.storeByte((if(payload) 1 else 0).toByte())
  }
  return ptr
}
}



@WasmExport("cm:example/kotlin#test")
fun __wasm_export_test0(): Int {
  freeAllComponentModelReallocAllocatedMemory()
  withScopedMemoryAllocator { allocator -> 

  val result: Result<Boolean> = KotlinExportsImpl.test()

  val ptr = /* RETURN_ADDRESS_ALLOC(size=8, align=4)*/ allocator.allocate(8).address.toInt()
  if (result.isFailure) {
    val payload0 = (result.exceptionOrNull() as ComponentException).value as Int
    (ptr + 0).ptr.storeByte(1.toByte())
    (ptr + 4).ptr.storeInt(payload0)
  } else {
    val payload = result.getOrThrow()!!
    (ptr + 0).ptr.storeByte(0.toByte())
    (ptr + 4).ptr.storeByte((if(payload) 1 else 0).toByte())
  }
  return ptr
}
}


